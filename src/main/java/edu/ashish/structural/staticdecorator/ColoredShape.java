package edu.ashish.structural.staticdecorator;

public class ColoredShape<T extends Shape> implements Shape {

    private Shape shape;

    private String color;

    public ColoredShape(T shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color " + color    ;
    }
}
