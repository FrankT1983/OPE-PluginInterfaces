package de.c3e.ProcessingManager.Types;

/***
 * Configure external tools-plugins to the need of the external program.
 */
@SuppressWarnings("unused")
public class ToolInputOutputConfiguration
{
    private boolean inputFromFolder = false;
    private boolean outputIntoFolder = false;

    private int outputSize = 1;
    private int inputSize = 1;

    private String outputFileName = "";
    private ToolInputOutputFileType outputFileType;
    private ToolInputOutputFileType inputFileType;

    /**
     * Tools like deconvolution lab will take a 8 bit grey scale and have a result which is a 32 bit grey scale ...
     * while maintaining the original min and max values ... this will confuse the inport functionality.
     * Set this to true, and the plugin-implementation will try to fix this problem
     */
    private boolean reinterpretDataTypes;


    /**
     * Get whether this tool requires its input as a folder or a file.
     * @return Wants a folder if true. A file otherwise.
     */
    public boolean isInputFromFolder()
    {
        return inputFromFolder;
    }

    /***
     * Set whether this tool requires its input as a folder or a file.
     * @param inputFromFolder Set to true if folder is required. False otherwise.
     */
    public void setInputFromFolder(boolean inputFromFolder)
    {
        this.inputFromFolder = inputFromFolder;
    }

    public boolean isOutputIntoFolder()
    {
        return outputIntoFolder;
    }

    public void setOutputIntoFolder(boolean outputIntoFolder)
    {
        this.outputIntoFolder = outputIntoFolder;
    }

    public String getOutputFileName()
    {
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName)
    {
        this.outputFileName = outputFileName;
    }

    public static ToolInputOutputConfiguration UseFileFromOutputFolder(String fileName)
    {
        ToolInputOutputConfiguration result = new ToolInputOutputConfiguration();
        result.setOutputFileName(fileName);
        result.setOutputIntoFolder(true);
        return result;
    }

    public ToolInputOutputConfiguration UseInputFolder()
    {
        this.setInputFromFolder(true);
        return this;
    }

    public static ToolInputOutputConfiguration UseFileFromOutputFolder(String fileName, ToolInputOutputFileType type)
    {
        ToolInputOutputConfiguration result = new ToolInputOutputConfiguration();
        result.setOutputFileName(fileName);
        result.setOutputIntoFolder(true);
        result.setOutputFileType(type);
        return result;
    }

    public static ToolInputOutputConfiguration InputType(ToolInputOutputFileType type)
    {
        ToolInputOutputConfiguration result = new ToolInputOutputConfiguration();
        result.setInputFileType(type);
        return result;
    }

    public void setOutputFileType(ToolInputOutputFileType outputFileType)
    {
        this.outputFileType = outputFileType;
    }

    public ToolInputOutputFileType getOutputFileType()
    {
        return outputFileType;
    }

    public void setReinterpretDataTypes(boolean reinterpretDataTypes)
    {
        this.reinterpretDataTypes = reinterpretDataTypes;
    }

    public boolean isReinterpretDataTypes()
    {
        return reinterpretDataTypes;
    }

    public ToolInputOutputConfiguration OutputsImage()
    {
        this.setOutputFileType(ToolInputOutputFileType.Image);
        return this;
    }

    public ToolInputOutputConfiguration OutputsCsv()
    {
        this.setOutputFileType(ToolInputOutputFileType.CSV);
        return this;
    }

    public ToolInputOutputConfiguration InputIsJson()
    {
        this.setInputFileType(ToolInputOutputFileType.Json);
        return this;
    }

    public ToolInputOutputConfiguration InputIsTable()
    {
        this.setInputFileType(ToolInputOutputFileType.Table);
        return this;
    }

    public ToolInputOutputConfiguration ReInterpretDataTypes()
    {
        this.setReinterpretDataTypes(true);
        return this;
    }

    public int getInputSize() {
        return inputSize;
    }

    public int getOutputSize() {
        return outputSize;
    }

    public void setInputFileType(ToolInputOutputFileType inputFileType) {
        this.inputFileType = inputFileType;
    }

    public ToolInputOutputFileType getInputFileType() {
        return inputFileType;
    }
}
