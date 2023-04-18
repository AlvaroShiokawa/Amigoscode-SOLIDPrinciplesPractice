package com.amigosgode.solid;

import java.util.List;

public class ShapesPrinter {
    private InterfaceAreaCalculator areaCalculator;

    public ShapesPrinter(InterfaceAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    //public String json(int sum) { return "{shapesSum: %s}".formatted(sum); }
    public String json(List<Shape> shapes) { return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes)); }

    //public String csv(int sum) { return "shapes_sum, %s".formatted(sum); }
    public String csv(List<Shape> shapes) {
        return "shapes_sum, %s".formatted(areaCalculator.sum(shapes));
    }
}