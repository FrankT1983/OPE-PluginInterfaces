package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelCalculatorBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.SplitType;
import de.c3e.ProcessingManager.Types.SplitTypes;

/**
 * Calculator for transforming a singe channel plane into a new plane
 * @deprecated Should be replace by the use of classes PlaneCalculator.
 */
@SuppressWarnings("unused")
@Deprecated()
public abstract class ChannelCalculator extends ParallelCalculatorBase implements ISupportsSplitting
{
    public ChannelCalculator()
    { super(new ImageDimension[]{});}

    public abstract double[][] Calculate(double data[][]);

    public final SplitType getSplitType()
    {
        return new SplitType(SplitTypes.independentChannels);
    }
}

