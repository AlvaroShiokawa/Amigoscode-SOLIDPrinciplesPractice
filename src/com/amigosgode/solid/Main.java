package com.amigosgode.solid;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
//        List<Object> shapes = List.of(circle, square);
        List<Shape> shapes = List.of(circle, square); // I will now use interface Shape here instead of Object.
        int sum = areaCalculator.sum(shapes);
        System.out.println("sum = " + sum);
        // System.out.println(areaCalculator.json(shapes)); // AreaCalculator is not supposed to print JSON, just do sum!
        ShapesPrinter printer = new ShapesPrinter(); // now we have a separated method to print the shapes, not longer hurting Single Responsibility
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }
}