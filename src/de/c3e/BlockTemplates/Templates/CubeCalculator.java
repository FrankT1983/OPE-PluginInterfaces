package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelCalculatorBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.SplitType;

import java.util.Arrays;
import java.util.HashSet;

/**
 * A abstract base class of a calculator transforming a 3D Cube of data into another cube of date.
 * Such as transforming one stack of a given channel.
 * @param <T> The data type of the cube.
 */
@SuppressWarnings({"unused", "FieldCanBeLocal"})
public abstract class CubeCalculator<T> extends ParallelCalculatorBase<T>  implements ISupportsSplitting
{
    public CubeCalculator(ImageDimension firstDirection, ImageDimension secondDirection, ImageDimension thirdDirection)
    {
        super(new ImageDimension[]{firstDirection, secondDirection,thirdDirection});

        // check, that dimensions are different
        HashSet<ImageDimension> test = new HashSet<>(Arrays.asList(this.dependency));
        assert test.size() == 3;
    }

    public abstract T[][][] Calculate(T[][][] data);
}
