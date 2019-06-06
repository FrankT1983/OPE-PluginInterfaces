package de.c3e.ProcessingManager.Interfaces;

import de.c3e.ProcessingManager.Types.SplitType;

import java.util.Map;

/**
 * Basic interface to describe a work block
 */
public interface IWorkBlock
{
    /**
     * Pass the Working block all inputs it needs to complete its's execution.
     * @param inputs The inputs.
     */
    void SetInputs(Map<String,Object> inputs);

    /**
     * Let the Block do it's work.
     */
    boolean RunWork();

    /**
     * Query the blocks for its results.
     * @return
     */
    Map<String,Object> GetResults();

    /**
     * Check whether the block completely finished its execution.
     * @return True, if it finished.
     */
    boolean IsFinished();
}
