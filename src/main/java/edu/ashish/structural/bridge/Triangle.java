package edu.ashish.structural.bridge;

public class Triangle extends Shape {

    public Triangle(IRenderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
