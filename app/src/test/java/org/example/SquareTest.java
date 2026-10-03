package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest
{
    @Test
    public void squareAreaWithZeroSideLength()
    {
        double sidelength = 0.0;
        Square square = new Square(sidelength);
        assertEquals(0, square.getArea());
    }

    @Test
    public void squarePerimeterWithZeroSideLength()
    {
        double sidelength = 0.0;
        Square square = new Square(sidelength);
        assertEquals(0, square.getPerimeter());
    }

    @Test
    public void squareAreaOneByOne()
    {
        double sidelength = 1.0;
        Square square = new Square(sidelength);
        assertEquals(1, square.getArea());
    }

    @Test
    public void squarePerimeterOnyByOne()
    {
        double sidelength = 1.0;
        Square square = new Square(sidelength);
        assertEquals(4, square.getPerimeter());
    }

    @Test
    public void squareAreaTwoByTwo()
    {
        double sidelength = 2.0;
        Square square = new Square(sidelength);
        assertEquals(4, square.getArea());
    }

    @Test
    public void squarePerimeterTwoByTwo()
    {
        double sidelength = 2.0;
        Square square = new Square(sidelength);
        assertEquals(8, square.getPerimeter());
    }

    @Test
    public void squareAreaWithLargeDimensions()
    {
        double sidelength = 45.5;
        Square square = new Square(sidelength);
        assertEquals(2070.25, square.getArea());
    }

    @Test
    public void squarePerimeterWIthLargeDimensions()
    {
        double sidelength = 45.5;
        Square square = new Square(sidelength);
        assertEquals(182, square.getPerimeter());
    }
}
