package edu.ashish.structural.bridge;

public class Circle extends Shape {

    public Circle(IRenderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
