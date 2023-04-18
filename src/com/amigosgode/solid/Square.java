package com.amigosgode.solid;

public class Square implements Shape{
    private final int length;
    public Square(int length) { this.length = length; }
    public int getLength() { return length; }

    @Override
    public double area() {
        return Math.pow(getLength(),2); // I don´t need to use AreaCalculator anymore, I am calculating here.
    }
}