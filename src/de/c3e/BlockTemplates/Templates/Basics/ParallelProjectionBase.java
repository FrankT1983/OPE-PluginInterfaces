package de.c3e.BlockTemplates.Templates.Basics;

import de.c3e.BlockTemplates.ImageDimension;
import de.c3e.BlockTemplates.Templates.Interfaces.IHasInputParameters;
import de.c3e.BlockTemplates.Templates.Interfaces.ISupportsSplitting;
import de.c3e.ProcessingManager.Types.SplitType;
import de.c3e.ProcessingManager.Types.SplitTypes;

import java.lang.reflect.ParameterizedType;

/**
 * Created by Frank on 14.06.2017.
 */
public abstract class ParallelProjectionBase<T> implements IHasInputParameters, ISupportsSplitting
{
    public Class<T> typeOfT;
    /**
     * The direction of the line, that should by calculated.
     */
    protected final ImageDimension[] dependency;
    protected final ImageDimension projectionDir;
    private IHasInputParameters impl;

    @SuppressWarnings("unchecked")
    public ParallelProjectionBase(ImageDimension[] dep, ImageDimension projectionDirection)
    {
        this.dependency = dep;
        this.projectionDir = projectionDirection;

        if (ParameterizedType.class.isAssignableFrom(this.getClass().getGenericSuperclass().getClass()))
        {
            // figure out type of generic class T
            try
            {
                this.typeOfT = (Class<T>)
                        ((ParameterizedType) getClass()
                                .getGenericSuperclass())
                                .getActualTypeArguments()[0];
            }catch (Exception ex)
            {
                // no type specified
                typeOfT = null;
            }
        }
        else {
            typeOfT = null;
        }
    }

    /**
     * Set the the Implementation for some basic dependencies.
     * @param implementation The implementation to use.
     */
    @SuppressWarnings("unused")
    public final void SetImplementation(IHasInputParameters implementation) {
        this.impl = implementation;
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
        return this.dependency;
    }

    public final ImageDimension getProjectionDirection()
    {
        return this.projectionDir;
    }

    // todo: don't make this final for now => do it later
    @Override
    public SplitType getSplitType()
    {
        return new SplitType(SplitTypes.useDependenciesAndProject, this.getDependency(),this.projectionDir);
    }
}
