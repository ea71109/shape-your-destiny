package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsoscelesRightTriangleTest {
    @Test
    public void isoscelesAreaWithZeroDimensions() {
        double legLength = 0.0;
        IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(legLength);
        assertEquals(0, isoscelesRightTriangle.getArea());
    }

    @Test
    public void isoscelesPerimeterWithZeroDimensions() {
        double legLength = 0.0;
        IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(legLength);
        assertEquals(0, isoscelesRightTriangle.getPerimeter());
    }

    @Test
    public void isoscelesAreaOnyByOne() {
        double legLength = 1.0;
        IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(legLength);
        assertEquals(0.5, isoscelesRightTriangle.getArea());
    }

    @Test
    public void isoscelesPerimeterOneByOne() {
        double legLength = 1.0;
        IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(legLength);
        assertEquals(2 + Math.sqrt(2), isoscelesRightTriangle.getPerimeter());
    }

    @Test
    public void isoscelesAreaTwoByTwo() {
        double legLength = 2.0;
        IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(legLength);
        assertEquals(2, isoscelesRightTriangle.getArea());
    }

    @Test
    public void isoscelesPerimeterTwoByTwo()
    {
        double legLength = 2.0;
        IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(legLength);
        assertEquals(4 + Math.sqrt(8), isoscelesRightTriangle.getPerimeter());
    }

    @Test
    public void isoscelesLargeArea()
    {
        double legLength = 33.5;
        IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(legLength);
        assertEquals(561.125, isoscelesRightTriangle.getArea());
    }

    @Test
    public void isoscelesLargePerimeter()
    {
        double legLength = 33.5;
        IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(legLength);
        assertEquals(67 + Math.sqrt((33.5 * 33.5) + (33.5*33.5)), isoscelesRightTriangle.getPerimeter());
    }

    @Test
    public void rightNumberOfSidesForIsoscelesRightTriangle()
    {
        double legLength = 1.0;
        IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(legLength);
        assertEquals(3, isoscelesRightTriangle.numberOfSides());
    }
}
