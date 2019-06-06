package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelProjectionBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;

abstract public class IndexedPointProjector<T> extends ParallelProjectionBase<T> implements ISupportsSplitting
{
    public IndexedPointProjector(ImageDimension projectionDirection)
    {
        super(new ImageDimension[]{}, projectionDirection);
    }

    abstract public T Aggregate(T data1, T data2, int dimIndexData1, int dimIndexData2);
}
