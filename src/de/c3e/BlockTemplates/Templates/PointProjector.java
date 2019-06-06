package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelProjectionBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;

/**
 * Created by Frank on 14.06.2017.
 */
abstract public class PointProjector<T> extends ParallelProjectionBase<T> implements ISupportsSplitting
{
    public PointProjector(ImageDimension projectionDirection)
    {
        super(new ImageDimension[]{}, projectionDirection);
    }

    abstract public T Aggregate(T data1, T data2);
}


