package de.c3e.BlockTemplates.Templates.Basics;

import de.c3e.BlockTemplates.Templates.Interfaces.IHasInputParameters;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.ToolInputOutputConfiguration;
import de.c3e.ProcessingManager.Types.SourceControlInfo;
import de.c3e.ProcessingManager.Types.SplitType;

import java.io.File;
import java.util.Arrays;
import java.util.List;


@SuppressWarnings({"unused", "FieldCanBeLocal", "WeakerAccess"})
public abstract class ExternalToolBlockBase implements ISupportsSplitting
{
    private SourceControlInfo SourceControl;
    private ToolInputOutputConfiguration IoConfig;
    private IHasInputParameters impl;
    protected String deploymentFolder = "";
    protected String workFolder = "";

    public ExternalToolBlockBase()
    {}

    public ExternalToolBlockBase(SourceControlInfo sourceControlInfo)
    {
      this.SourceControl = sourceControlInfo;
    }

    public ExternalToolBlockBase(SourceControlInfo sourceControlInfo, ToolInputOutputConfiguration ioConfig)
    {
        this.SourceControl = sourceControlInfo;
        this.IoConfig = ioConfig;
    }

    public SourceControlInfo getSourceControlInfo()
    {
        return this.SourceControl;
    }

    public ToolInputOutputConfiguration getInputOutputConfig()
    {
        return this.IoConfig;
    }

    /**
     * Call the external tool.
     * @param pathToInputFile The path where the input is stored as a file.
     * @param pathToOutput Tho path where the output should be created by the tool
     */
    public abstract void RunCalculation(List<File> pathToInputFile, List<File> pathToOutput);

    public final void SetImplementation(IHasInputParameters implementation) {
        this.impl = implementation;
    }

    @Override
    public SplitType getSplitType()
    {
        return SplitType.cantSplit;
    }

    final public void setDeploymentFolder(String newFolder)
    {
        this.deploymentFolder = newFolder!=null?newFolder:"";
    }
    final public void setWorkFolder(String newFolder)
    {
        this.workFolder = newFolder!=null?newFolder:"";
    }
}


