package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelProjectionBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;

/**
 * Created by Frank on 14.06.2017.
 */
abstract public class PointProjectorShort extends ParallelProjectionBase<Short> implements ISupportsSplitting
{
    public PointProjectorShort(ImageDimension projectionDirection)
    {
        super(new ImageDimension[]{}, projectionDirection);
    }

    abstract public short Aggregate(short data1, short data2);
}
