package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelCalculatorBase;
import de.c3e.BlockTemplates.Templates.Basics.ParallelExternalToolBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.SplitType;
import de.c3e.ProcessingManager.Types.SplitTypes;

/***
 * Abstract base class for a calculator that transforms a 2 dimensional plane of data into another
 * plane of data.
 * @param <T>
 */
@SuppressWarnings({"unused", "FieldCanBeLocal"})
public abstract class PlaneCalculator<T> extends ParallelCalculatorBase<T>  implements  ISupportsSplitting
{
    public PlaneCalculator(ImageDimension firstDirection, ImageDimension secondDirection)
    {
        super(new ImageDimension[]{firstDirection, secondDirection});
        assert firstDirection!=secondDirection;
    }

    abstract public T[][] Calculate(T[][] data);
}


