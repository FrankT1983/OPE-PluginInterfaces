package de.c3e.BlockTemplates.Templates.Basics;

@SuppressWarnings({"unused"})
public interface ISupportsDataRange
{
    double getMinValue();
    double getMaxValue();

    void setMinValue(double newMin);
    void setMaxValue(double newMax);
}
