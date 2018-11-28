package ua.com.homework.java.serebryakova.DZ1;

import ua.com.homework.java.serebryakova.DZ1.circle.Circle;
import ua.com.homework.java.serebryakova.DZ1.square.Square;
import ua.com.homework.java.serebryakova.DZ1.triangle.Triangle;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



public class AppRunner {

   static Logger logger = Logger.getLogger(AppRunner.class.getName());


    public static void main(String[] args) {
        Shape triangle1 = new Triangle(50, 25);
        Shape triangle2 = new Triangle(25, 15);
        Shape circle1 = new Circle(30.0);
        Shape circle2 = new Circle(20.0);
        Shape square1 = new Square(25, 25);
        Shape square2 = new Square(15, 15);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(square1);
        shapes.add(square2);

        Shape maxShape = shapes.get(0);
        for (int i = 1; i < shapes.size(); i++) {
            if (maxShape.getArea() < shapes.get(i).getArea()) {

                maxShape = shapes.get(i);
            }
        }
            logger.info("Maximal area of shape is " + maxShape + " and type is " + maxShape.getClass().getSimpleName());
        }
    }
