package de.c3e.ProcessingManager.Types;

import de.c3e.BlockTemplates.ImageDimension;

import java.io.Serializable;

@SuppressWarnings("unused")
public class SplitType implements Serializable
{
    public SplitType(SplitTypes type)
    {
        this.type = type;
        if (type == SplitTypes.useDependencies)
        {
            assert false;
            // should have dependencies
        }

        this.dependencies = null;
        this.projectionDirection = null;
    }

    public static final SplitType cantSplit = new SplitType(SplitTypes.cantSplit);

    public SplitTypes type;
    public ImageDimension[] dependencies;
    public ImageDimension projectionDirection;

    public SplitType(SplitTypes type, ImageDimension[] dependency)
    {
        this.type = type;
        this.dependencies = dependency;
        this.projectionDirection= null;
    }

    public SplitType(SplitTypes type, ImageDimension[] dependency, ImageDimension projectionDirection)
    {
        this.type = type;
        this.dependencies = dependency;
        this.projectionDirection = projectionDirection;
    }

    @Override
    public String toString()
    {
        switch (type)
        {
            case cantSplit: return "SplitType: can't split";
            case useDependencies:  return  "SplitType: use Dependencies";
            case independentPoints:return  "SplitType: use independentPoints";
            case independentChannels: return  "SplitType: use independentChannels";
            case useDependenciesAndProject:  return  "SplitType: use dependencies and project";
            default: return  "SplitType: " + type.toString();
        }
    }
}
