package de.c3e.ProcessingManager.Types;

/***
 * Specify where the something is situated in a source control system.
 */
@SuppressWarnings("unused")
public class SourceControlInfo
{
    public final String SourceControlType;
    public final String Version;
    public final String SourceControlRepo;
    public final String SourceControlPath;

    public SourceControlInfo(String sourceControl, String repo,String path,String version)
    {
        this.SourceControlType = sourceControl;
        this.SourceControlRepo = repo;
        this.SourceControlPath = path;
        this.Version = version;
    }
}

