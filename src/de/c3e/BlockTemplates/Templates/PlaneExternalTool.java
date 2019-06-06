package de.c3e.BlockTemplates.Templates;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Basics.ParallelExternalToolBase;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.ToolInputOutputConfiguration;
import de.c3e.ProcessingManager.Types.SourceControlInfo;

/**
 * Base class of plugins doing plane-wise parallelization of an external tool.
 */
@SuppressWarnings("unused")
public abstract class PlaneExternalTool extends ParallelExternalToolBase implements ISupportsSplitting
{
    public PlaneExternalTool(ImageDimension firstDirection, ImageDimension secondDirection)
    {
        super(new ImageDimension[]{firstDirection, secondDirection});
        assert firstDirection!=secondDirection;
    }

    public PlaneExternalTool(SourceControlInfo sourceControlInfo, ImageDimension firstDirection, ImageDimension secondDirection)
    {
        super(sourceControlInfo,new ImageDimension[]{firstDirection, secondDirection});
        assert firstDirection!=secondDirection;
    }

    public PlaneExternalTool(SourceControlInfo sourceControlInfo, ToolInputOutputConfiguration ioConfig, ImageDimension firstDirection, ImageDimension secondDirection)
    {
        super(sourceControlInfo, ioConfig, new ImageDimension[]{firstDirection, secondDirection});
        assert firstDirection!=secondDirection;
    }
}
