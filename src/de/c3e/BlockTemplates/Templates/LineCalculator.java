package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelCalculatorBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.SplitType;

/**
 * Abstract base class for transforming a single line of points into another line
 * @param <T> The data type of the points in the line.
 */
@SuppressWarnings({"unused", "FieldCanBeLocal"})
public abstract class LineCalculator<T> extends ParallelCalculatorBase<T>  implements ISupportsSplitting
{
    abstract public T[] Calculate(T[] data);

    /**
     * Construct a new LineCalculator.
     * @param lineDimension The direction of the line to be calculated.
     */
    public LineCalculator(ImageDimension lineDimension)
    {
        super(new ImageDimension[]{lineDimension});
    }
}
