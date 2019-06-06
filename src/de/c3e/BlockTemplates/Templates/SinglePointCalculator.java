package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelCalculatorBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.SplitType;
import de.c3e.ProcessingManager.Types.SplitTypes;

/***
 * A abstract base class defining a calculator that transform a single pixel into a new value.
 * @param <T> The Type of a given pixel.
 */
@SuppressWarnings("unused")
abstract public class SinglePointCalculator<T> extends ParallelCalculatorBase<T> implements ISupportsSplitting
{
    public SinglePointCalculator()
    {super(new ImageDimension[]{});}

    abstract public T Calculate(T data);

    public final SplitType getSplitType()
    {
        return new SplitType(SplitTypes.independentPoints);
    }
}


