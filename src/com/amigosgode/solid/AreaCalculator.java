package com.amigosgode.solid;

import java.util.List;

public class AreaCalculator implements InterfaceAreaCalculator {
    public int sum(List<Shape> shapes) { // Instead of Object we wil take Shape, because of the Shape interfgace.
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            // Object shape = shapes.get(i); // we no longer need to use this object, because we are using interface

            // Let´s get rid of all of this because they all break the Open Close principle,
            // leaving the class open for changes and implementation...
//            if (shape instanceof Square) { sum += Math.pow(((Square) shape).getLength(),2);}
//            if (shape instanceof Circle) { sum += Math.PI * Math.pow(((Circle) shape).getRadius(),2);}
//            if (shape instanceof Cube) { sum += 6*Math.pow(((Square) shape).getLength(),2);}

            // instead we only need to call the area() method from the current implementation of Shape
            // being read, like this:
            sum += shapes.get(i).area();
        }

        return sum;
    }

    // AreaCalculator is not supposed to print JSON, just do sum!
    // Here we broke the Single Responsibility Principle.
//    public String json(List<Object> shapes) {
//        return "{sum: %s}".formatted(sum(shapes));
//    }
}
