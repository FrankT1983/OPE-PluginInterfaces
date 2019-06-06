package de.c3e.BlockTemplates.Templates.Interfaces;

import de.c3e.ProcessingManager.Types.SplitType;

/**
 * Indicates that this object supports the splitting of input data.
 */
public interface ISupportsSplitting
{
    /**
     * Determine what kind of image data splitting this worker supports.
     * @return The supported split type
     */
    SplitType getSplitType();

}


