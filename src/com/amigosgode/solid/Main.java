package com.amigosgode.solid;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        InterfaceAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
//        List<Object> shapes = List.of(circle, square);

        //NoShape noshape = new NoShape(); // You will see that because of the area() method´s implementation, this will fail!
        //Shape noshape = new NoShape(); // Even easier to check now the problem. The mother class Shape CANNOT be substitutued by its subclass NoShape, because of the area() method!
        //List<Shape> shapes = List.of(circle, square, cube, noshape); // I added the no shape to the list.
        List<Shape> shapes = List.of(circle, square, cube); // I will now use interface Shape here instead of Object.

        int sum = areaCalculator.sum(shapes);
        System.out.println("sum = " + sum);
        // System.out.println(areaCalculator.json(shapes)); // AreaCalculator is not supposed to print JSON, just do sum!
        ShapesPrinter printer = new ShapesPrinter(areaCalculator); // now we have a separated method to print the shapes, not longer hurting Single Responsibility
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}