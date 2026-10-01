package org.example;

public class RightTriangle extends Shape
{
    private double length;
    private double width;

    public RightTriangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return (length * width) / 2;
    }

    @Override
    public double getPerimeter()
    {
        return (length + width) + Math.sqrt((length * length) + (width * width));
    }
}
