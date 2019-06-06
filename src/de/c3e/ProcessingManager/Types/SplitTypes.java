package de.c3e.ProcessingManager.Types;

import java.io.Serializable;

/**
 * Split type determines how a work block can work with an sub image without losing correctness
 */
@SuppressWarnings({"unused", "FieldCanBeLocal"})
public enum SplitTypes implements Serializable
{
    cantSplit ,
    independentChannels,
    independentPoints,

    /// use the dependencies attribute provided to determine how to split
    useDependencies,
    useDependenciesAndProject,
}
