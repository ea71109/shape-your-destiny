package org.example;

public class IsoscelesRightTriangle extends RightTriangle implements Polygon
{
    public IsoscelesRightTriangle(double legLength)
    {
        super(legLength, legLength);
    }

    @Override
    public int numberOfSides()
    {
        return 3;
    }
}
