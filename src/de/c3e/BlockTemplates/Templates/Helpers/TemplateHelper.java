package de.c3e.BlockTemplates.Templates.Helpers;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Frank on 17.03.2017.
 */
@SuppressWarnings("unused")
public class TemplateHelper
{

    /***
     * Create an array of the same size size.
     * It assumes that all sub arrays have the same length.
     * @param input
     * @return
     */
    static public <T> T[][][][][] CreateNewWithSameSize(T[][][][][] input)
    {
        int size1=input.length;
        int size2=input[0].length;
        int size3=input[0][0].length;
        int size4=input[0][0][0].length;
        int size5=input[0][0][0][0].length;
        Class c = input[0][0][0][0][0].getClass();

        T[][][][][] res = (T[][][][][])Array.newInstance(c, size1, size2, size3,size4,size5);
        return res;
    }

    static public <T> T[][][][] CreateNewWithSameSize(T[][][][] input)
    {
        int size1=input.length;
        int size2=input[0].length;
        int size3=input[0][0].length;
        int size4=input[0][0][0].length;
        Class c =input[0][0][0][0].getClass();

        T[][][][] res = (T[][][][])Array.newInstance(c, size1, size2, size3,size4);
        return res;
    }

    static public <T> T[][][] CreateNewWithSameSize(T[][][] input)
    {
        int size1=input.length;
        int size2=input[0].length;
        int size3=input[0][0].length;
        Class c =input[0][0][0].getClass();

        T[][][] res = (T[][][])Array.newInstance(c, size1, size2, size3);
        return res;
    }

    static public <T> T[][] CreateNewWithSameSize(T[][] input)
    {
        int size1=input.length;
        int size2=input[0].length;

        Class c =input[0][0].getClass();

        T[][] res = (T[][])Array.newInstance(c, size1, size2);
        return res;
    }

    static public byte[][] CreateNewWithSameSize(byte[][] input)
    {
        int size1=input.length;
        int size2=input[0].length;

        byte[][] res = new byte[size1][];
        for(int i=0;i<size1;i++)
        {
            res[i] = new byte[size2];
        }
        return res;
    }

    static public double[][] CreateNewWithSameSize(double[][] input)
    {
        int size1=input.length;
        int size2=input[0].length;

        double[][] res = new double[size1][];
        for(int i=0;i<size1;i++)
        {
            res[i] = new double[size2];
        }
        return res;
    }

    static public float[][] CreateNewWithSameSize(float[][] input)
    {
        int size1=input.length;
        int size2=input[0].length;

        float[][] res = new float[size1][];
        for(int i=0;i<size1;i++)
        {
            res[i] = new float[size2];
        }
        return res;
    }
}
