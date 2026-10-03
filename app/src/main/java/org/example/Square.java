package org.example;

public class Square extends Rectangle implements Polygon {
    public Square(double sidelength)
    {
        super(sidelength, sidelength);
    }

    @Override
    public int numberOfSides()
    {
        return 4;
    }
}
