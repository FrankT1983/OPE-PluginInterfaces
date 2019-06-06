package de.c3e.BlockTemplates.Templates.Basics;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Interfaces.IHasInputParameters;
import de.c3e.BlockTemplates.Templates.Interfaces.IRequiresMerging;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.*;

@SuppressWarnings({"unused", "FieldCanBeLocal"})
public abstract class ParallelExternalToolBase extends ExternalToolBlockBase implements IHasInputParameters, ISupportsSplitting, IRequiresMerging
{
    private final IMergePostProcessing mergePostProcessing;
    private IHasInputParameters impl;

    /**
     * The direction of the line, that should by calculated.
     */
    protected final ImageDimension[] dependency;


    @SuppressWarnings("unchecked")
    public ParallelExternalToolBase(ImageDimension[] dep)
    {
        this(null,null,null,dep);
    }

    public ParallelExternalToolBase(SourceControlInfo sourceControlInfo, ImageDimension[] dep)
    {
        this(sourceControlInfo,null, null,dep);

    }

    public ParallelExternalToolBase(SourceControlInfo sourceControlInfo, ToolInputOutputConfiguration ioConfig, ImageDimension[] dep)
    {
        this(sourceControlInfo,ioConfig, null,dep);
    }


    public ParallelExternalToolBase(SourceControlInfo sourceControlInfo, ToolInputOutputConfiguration ioConfig,IMergePostProcessing modifier, ImageDimension[] dep)
    {
        super(sourceControlInfo,ioConfig);
        this.dependency = dep;
        this.mergePostProcessing = modifier;
    }

    /**
     * Get the double value of a parameter with a given Id
     *
     * Delegate getDoubleInput to implementation of IHasInputParameters that will be provided by the
     * Execution frame work. Make this final, to prevent user from overriding it by accident.
     * @param id The Id of t
     * @return The value of the input parameter.
     */
    @Override
    public final Double getDoubleInput(String id)
    {
        return this.impl.getDoubleInput(id);
    }

    @Override
    public final <InputTyp> InputTyp getInput(String id)
    {
        return this.impl.getInput(id);
    }

    /**
     * Return the dependent dimensions of this calculation plug in.
     * @return The dependencies.
     */
    public final ImageDimension[] getDependency()
    {
        return dependency;
    }

    // todo: don't make this final for now => do it later
    @Override
    public SplitType getSplitType()
    {
        return new SplitType(SplitTypes.useDependencies, this.getDependency());
    }

    @Override
    public final IMergePostProcessing getMergePostProcessing()
    {
        return  this.mergePostProcessing;
    }
}
