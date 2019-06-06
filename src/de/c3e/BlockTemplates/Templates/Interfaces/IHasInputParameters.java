package de.c3e.BlockTemplates.Templates.Interfaces;

/**
 * Interface for indicating that a object has input parameters that can be queried.
 */
public interface IHasInputParameters
{
    Double getDoubleInput(String id);

    <T> T getInput(String id);
}
