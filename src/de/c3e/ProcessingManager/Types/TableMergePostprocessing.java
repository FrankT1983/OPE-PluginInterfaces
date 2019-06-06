package de.c3e.ProcessingManager.Types;

@SuppressWarnings("unused") // will be used bz dependent jars
public class TableMergePostprocessing implements IMergePostProcessing
{
    private final Mode mode;

    private TableMergePostprocessing(Mode modeToUse)
    {
        this.mode = modeToUse;
    }

    public enum Mode{
        AttachOrModifyColumn,
    }

    public static TableMergePostprocessing CreatePositionColumn()
    {
        return new TableMergePostprocessing(Mode.AttachOrModifyColumn);
    }

    public Mode getMode()
    {
        return mode;
    }
}


