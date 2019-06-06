package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelProjectionBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;

/**
 * Created by Frank on 14.06.2017.
 */
abstract public class PointProjectorDouble extends ParallelProjectionBase<Double> implements ISupportsSplitting
{
    public PointProjectorDouble(ImageDimension projectionDirection)
    {
        super(new ImageDimension[]{}, projectionDirection);
    }

    abstract public double Aggregate(double data1, double data2);
}

