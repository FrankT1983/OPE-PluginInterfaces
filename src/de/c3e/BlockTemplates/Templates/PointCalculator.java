package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelCalculatorBase;
import de.c3e.BlockTemplates.Templates.Interfaces.IHasInputParameters;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.SplitType;
import de.c3e.ProcessingManager.Types.SplitTypes;

/**
 * Public class for PointCalculator
 */
@SuppressWarnings("unused")
@Deprecated()
public abstract class PointCalculator extends ParallelCalculatorBase implements ISupportsSplitting
{
    public PointCalculator()
    {super(new ImageDimension[]{});}

    public abstract double Calculate(double input);

    public final SplitType getSplitType()
    {
        return new SplitType(SplitTypes.independentPoints);
    }
}
