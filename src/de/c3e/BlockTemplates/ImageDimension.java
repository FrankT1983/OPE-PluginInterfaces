package de.c3e.BlockTemplates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * The selection of all available image dimensions.
 */
@SuppressWarnings("unused")
public enum ImageDimension
{
    X,
    Y,
    Z,
    T,
    C;

    public final static List<ImageDimension> AllValues = Arrays.asList(ImageDimension.X,ImageDimension.Y,ImageDimension.C, ImageDimension.Z, ImageDimension.T );

    public static Collection<ImageDimension> others(ImageDimension withoutD)
    {
        List<ImageDimension> result = new ArrayList<>();
        for(ImageDimension d: ImageDimension.values())
        {
            if(d != withoutD)
            {
                result.add(d);
            }
        }
        return result;
    }

    public static Collection<ImageDimension> others(Collection<ImageDimension> withoutD)
    {
        List<ImageDimension> result = new ArrayList<>();
        for(ImageDimension d: ImageDimension.values())
        {
            if(!withoutD.contains(d))
            {
                result.add(d);
            }
        }
        return result;
    }
}
