package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void areaWithRadiusZero()
    {
        double radius = 0;
        Circle circle = new Circle(radius);
        assertEquals(0.0, circle.getArea());
    }

    @Test
    public void areaWithRadiusOne()
    {
        double radius = 1.0;
        Circle circle = new Circle(radius);
        assertEquals(Math.PI, circle.getArea());
    }

    @Test
    public void perimeterWithRadiusOne()
    {
        double radius = 1.0;
        Circle circle = new Circle(radius);
        assertEquals(2 * Math.PI, circle.getPerimeter());
    }

    @Test
    public void areaWithRadiusTwo()
    {
        double radius = 2.0;
        Circle circle = new Circle(radius);
        assertEquals(Math.PI * 4, circle.getArea());
    }

    @Test
    public void perimeterWithRadiusTwo()
    {
        double radius = 2.0;
        Circle circle = new Circle(radius);
        assertEquals(2 * Math.PI * 2, circle.getPerimeter());
    }

    @Test
    public void AreaWithLargeRadius()
    {
        double radius = 100.345;
        Circle circle = new Circle(radius);
        assertEquals((100.345 * 100.345) * Math.PI, circle.getArea());
    }

    @Test
    public void PerimeterWithLargeRadius()
    {
        double radius = 100.345;
        Circle circle = new Circle(radius);
        assertEquals(2 * Math.PI * 100.345, circle.getPerimeter());
    }


}
