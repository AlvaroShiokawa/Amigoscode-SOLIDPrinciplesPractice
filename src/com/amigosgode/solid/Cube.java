package com.amigosgode.solid;

public class Cube implements Shape,ThreeDimensionalShape {
    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 0; // I will just leave this empty for now
    }
}
