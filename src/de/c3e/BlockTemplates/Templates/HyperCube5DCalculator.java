package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelCalculatorBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.SplitType;
import de.c3e.ProcessingManager.Types.SplitTypes;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;

/**
 * A abstract base class of a calculator transforming a 5D Hyper Cube of data into another 5D cube of data.
 * This means all transformations, that need the complete image.
 * @param <T> The data type of the cube.
 */
@SuppressWarnings({"unused", "FieldCanBeLocal"})
public abstract class HyperCube5DCalculator<T> extends ParallelCalculatorBase<T>  implements ISupportsSplitting
{
    public HyperCube5DCalculator()
    {
        super(ImageDimension.values());

        // check, that dimensions are different
        HashSet<ImageDimension> test = new HashSet<>(Arrays.asList(this.dependency));
        assert test.size() == 5;
    }

    public abstract T[][][][][] Calculate(T[][][][][] data);
}
