package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelProjectionBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;

/**
 * Created by Frank on 14.06.2017.
 */
abstract public class PlaneProjector<T> extends ParallelProjectionBase<T> implements ISupportsSplitting
{
    public PlaneProjector(ImageDimension firstDirection, ImageDimension secondDirection, ImageDimension projectionDirection)
    {
        super(new ImageDimension[]{firstDirection, secondDirection},projectionDirection);
        assert firstDirection!=secondDirection;
    }

    abstract public T[][] Aggregate(T[][] data1, T[][] data2);
}


