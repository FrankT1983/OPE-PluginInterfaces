package de.c3e.BlockTemplates.Templates.Helpers;

import sun.swing.plaf.synth.SynthFileChooserUI;

import java.io.Console;
import java.io.File;
import java.util.Arrays;

@SuppressWarnings({"unused", "FieldCanBeLocal"})
public class ExternalProgramHelpers
{
    public static  int CallProgramArgs(String workFolder, String... command)
    {
        /// see: http://www.rgagnon.com/javadetails/java-0014.html
        // https://stackoverflow.com/questions/19621838/createprocess-error-2-the-system-cannot-find-the-file-specified
        ProcessBuilder pb = null;
        try {
            System.out.println("Called external program (1): " + Arrays.toString(command));
            pb = new ProcessBuilder(command)
                    .inheritIO()
                    .directory(new File(workFolder))
                    .redirectErrorStream(true);

            Process p = pb.start();
            return p.waitFor();

        }
        catch (Exception err)
        {
            if (pb != null) {
                System.out.println("Could not call external program: " + pb.directory().getAbsolutePath() + " directory ");
            }
            err.printStackTrace();
            return -1;
        }
    }

    public static  int CallJar(String jarFile , String command, String deploymentFolder, String workFolder)
    {
        File f = new File(jarFile);
        if(f.exists() && !f.isDirectory()) {
            String com =  "java -jar " + f.getAbsolutePath() + " " + command;
            int returnValue = CallProgramInFolder(com,workFolder);
            System.out.println("Called external jar program (1): " + com + " return code: " + returnValue);
            return returnValue;
        }

        if (!deploymentFolder.equals(""))
        {
            f = new File(deploymentFolder + "/" + jarFile);
            if(f.exists() && !f.isDirectory())
            {
                String com = "java -jar " + f.getAbsolutePath() + " " + command;
                int returnValue = CallProgramInFolder(com,workFolder);
                System.out.println("Called external jar program (2): " + com + " return code: " + returnValue);
                return returnValue;
            }
        }

        System.out.println("Could not find jar file : "  + f.getAbsolutePath() + " passed as " + jarFile  + " in deployment folder  " + deploymentFolder);
        return -1;
    }

    public static int CallProgram(String command, String workFolder)
    {
        return CallProgramInFolder(command, workFolder);
    }

    public static int CallProgramInFolder(String command, String workFolder)
    {
        return CallProgramArgs(workFolder,command.split(" ") );
    }

}
