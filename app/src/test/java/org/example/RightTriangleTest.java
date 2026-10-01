package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RightTriangleTest {
    @Test
    public void RightTriangleAreaWithZeroDimensions()
    {
        double length = 0.0;
        double width = 0.0;
        RightTriangle rightTriangle = new RightTriangle(length, width);
        assertEquals(0, rightTriangle.getArea());
    }

    @Test
    public void RightTrianglePerimeterWithZeroDimensions()
    {
        double length = 0.0;
        double width = 0.0;
        RightTriangle rightTriangle = new RightTriangle(length, width);
        assertEquals(0, rightTriangle.getPerimeter());
    }

    @Test
    public void RightTriangleAreaOneByOne()
    {
        double length = 1.0;
        double width = 1.0;
        RightTriangle rightTriangle = new RightTriangle(length, width);
        assertEquals(0.5, rightTriangle.getArea());
    }

    @Test
    public void RightTrianglePerimeterOneByOne()
    {
        double length = 1.0;
        double width = 1.0;
        RightTriangle rightTriangle = new RightTriangle(length, width);
        assertEquals(2 + Math.sqrt(2), rightTriangle.getPerimeter());
    }

    @Test
    public void RightTriangleAreaTwoByTwo()
    {
        double length = 2.0;
        double width = 2.0;
        RightTriangle rightTriangle = new RightTriangle(length, width);
        assertEquals(2, rightTriangle.getArea());
    }

    @Test
    public void RightTrianglePerimeterTwoByTwo()
    {
        double length = 2.0;
        double width = 2.0;
        RightTriangle rightTriangle = new RightTriangle(length, width);
        assertEquals(4 + Math.sqrt(8), rightTriangle.getPerimeter());
    }

    @Test
    public void AreaOfLargeRightTriangle()
    {
        double length = 83.2;
        double width = 53.3;
        RightTriangle rightTriangle = new RightTriangle(length, width);
        assertEquals((83.2 * 53.3) / 2, rightTriangle.getArea());
    }

    @Test
    public void PerimeterOfLargeRightTriangle()
    {
        double length = 83.2;
        double width = 53.3;
        RightTriangle rightTriangle = new RightTriangle(length, width);
        assertEquals((83.2 + 53.3) + Math.sqrt((83.2 * 83.2) + (53.3 * 53.3)), rightTriangle.getPerimeter());
    }


}
