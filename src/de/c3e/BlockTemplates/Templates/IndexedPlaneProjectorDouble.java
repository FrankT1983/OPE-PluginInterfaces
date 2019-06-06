package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelProjectionBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;

@SuppressWarnings({"unused", "FieldCanBeLocal"})
abstract public class IndexedPlaneProjectorDouble extends ParallelProjectionBase<Double> implements ISupportsSplitting
{
    public IndexedPlaneProjectorDouble(ImageDimension firstDirection, ImageDimension secondDirection, ImageDimension projectionDirection)
    {
        super(new ImageDimension[]{firstDirection, secondDirection},projectionDirection);
        assert firstDirection!=secondDirection;

    }

    abstract public double[][] Aggregate(double[][] data1, double[][] data2, int dimIndexData1, int dimIndexData2);
}
