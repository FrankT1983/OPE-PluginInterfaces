package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelExternalToolBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;

import de.c3e.ProcessingManager.Types.IMergePostProcessing;
import de.c3e.ProcessingManager.Types.SourceControlInfo;
import de.c3e.ProcessingManager.Types.ToolInputOutputConfiguration;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Base class of plugins doing cube-wise parallelization of an external tool.
 */
@SuppressWarnings("unused")
public abstract class CubeExternalTool extends ParallelExternalToolBase implements ISupportsSplitting
{
    public CubeExternalTool(ImageDimension firstDirection, ImageDimension secondDirection, ImageDimension thirdDirection)
    {
        super(new ImageDimension[]{firstDirection, secondDirection,thirdDirection});
        // check, that dimensions are different
        HashSet<ImageDimension> test = new HashSet<>(Arrays.asList(this.dependency));
        assert test.size() == 3;
    }

    public CubeExternalTool(SourceControlInfo sourceControlInfo, ImageDimension firstDirection, ImageDimension secondDirection, ImageDimension thirdDirection)
    {
        super(sourceControlInfo,new ImageDimension[]{firstDirection, secondDirection, thirdDirection});

        HashSet<ImageDimension> test = new HashSet<>(Arrays.asList(this.dependency));
        assert test.size() == 3;
    }



    public CubeExternalTool(SourceControlInfo sourceControlInfo, ToolInputOutputConfiguration ioConfig, ImageDimension firstDirection, ImageDimension secondDirection, ImageDimension thirdDirection)
    {
        super(sourceControlInfo, ioConfig, new ImageDimension[]{firstDirection, secondDirection ,thirdDirection});

        HashSet<ImageDimension> test = new HashSet<>(Arrays.asList(this.dependency));
        assert test.size() == 3;
    }


    public CubeExternalTool(SourceControlInfo sourceControlInfo, ToolInputOutputConfiguration ioConfig, IMergePostProcessing modifier, ImageDimension firstDirection, ImageDimension secondDirection, ImageDimension thirdDirection)
    {
        super(sourceControlInfo, ioConfig, modifier, new ImageDimension[]{firstDirection, secondDirection ,thirdDirection});

        HashSet<ImageDimension> test = new HashSet<>(Arrays.asList(this.dependency));
        assert test.size() == 3;
    }
}