package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelCalculatorBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.SplitType;

import java.util.Arrays;
import java.util.HashSet;

/**
 * A abstract base class of a calculator transforming a 4D Hyper Cube of data into another 4D cube of data.
 * Such as transforming one stack of multiple channels into a new one.
 * @param <T> The data type of the cube.
 */
@SuppressWarnings({"unused", "FieldCanBeLocal"})
abstract public class HyperCube4DCalculator <T> extends ParallelCalculatorBase<T>  implements ISupportsSplitting
{
    public HyperCube4DCalculator(ImageDimension firstDirection, ImageDimension secondDirection, ImageDimension thirdDirection, ImageDimension fourthDirection)
    {
        super(new ImageDimension[]{firstDirection, secondDirection,thirdDirection,fourthDirection});

        // check, that dimensions are different
        HashSet<ImageDimension> test = new HashSet<>(Arrays.asList(this.dependency));
        assert test.size() == 4;
    }

    public abstract T[][][][] Calculate(T[][][][] data);
}
