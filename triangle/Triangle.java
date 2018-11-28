package ua.com.homework.java.serebryakova.DZ1.triangle;



import ua.com.homework.java.serebryakova.DZ1.AbstractShape;


public class Triangle extends AbstractShape {
    private  double a, b;

    public Triangle() {
        this(1,1);
    }
    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getArea() {
        double s = (a + b) / 2;
        return Math.sqrt(s);
    }


}