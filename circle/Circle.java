package ua.com.homework.java.serebryakova.DZ1.circle;

import ua.com.homework.java.serebryakova.DZ1.AbstractShape;



public class Circle extends AbstractShape{
    private final double radius;
    private final double pi = Math.PI;

    public Circle() {
        this(1);
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }
}
