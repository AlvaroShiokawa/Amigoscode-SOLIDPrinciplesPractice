package com.amigosgode.solid;

public class Circle implements Shape {
    private final int radius;
    public Circle(int radius) { this.radius = radius;}
    public int getRadius() { return radius;}

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(),2); // I am implementing this method from Shape, now I don´t need to use it on AreaCalculator.
    }
}
