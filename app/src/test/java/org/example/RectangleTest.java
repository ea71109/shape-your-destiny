package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void rectangleAreaWithZeroDimensions()
    {
        double length = 0.0;
        double width = 0.0;
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(0, rectangle.getArea());
    }

    @Test
    public void rectanglePerimeterWithZeroDimensions()
    {
        double length = 0.0;
        double width = 0.0;
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(0, rectangle.getPerimeter());
    }

    @Test
    public void areaOfOneByOneRectangle()
    {
        double length = 1.0;
        double width = 1.0;
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(1, rectangle.getArea());
    }

    @Test
    public void perimeterOfOneByOneRectangle() {
        double length = 1.0;
        double width = 1.0;
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(4, rectangle.getPerimeter());
    }

    @Test
    public void areaOfTwoByTwoRectangle()
    {
        double length = 2.0;
        double width = 2.0;
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(4, rectangle.getArea());
    }

    @Test
    public void perimeterOfTwoByTwoRectangle()
    {
        double length = 2.0;
        double width = 2.0;
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(8, rectangle.getPerimeter());
    }

    @Test
    public void areaOfLargeRectangle()
    {
        double length = 45.3;
        double width = 83.2;
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(45.3 * 83.2, rectangle.getArea());
    }

    @Test
    public void perimeterOfLargeRectangle()
    {
        double length = 45.3;
        double width = 83.2;
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(2*(45.3 + 83.2), rectangle.getPerimeter());
    }



}
