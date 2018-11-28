package ua.com.homework.java.serebryakova.DZ1.square;


import ua.com.homework.java.serebryakova.DZ1.AbstractShape;


public class Square extends AbstractShape {
    private final double width, height, area;

    public Square (double width, double height) {
        this.width = width;
        this.height= height;
        this.area = width * height;

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}

