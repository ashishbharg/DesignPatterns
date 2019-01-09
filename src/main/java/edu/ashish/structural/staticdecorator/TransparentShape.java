package edu.ashish.structural.staticdecorator;

public class TransparentShape<T extends Shape> implements Shape {

    private int transparency;

    private Shape shape;

    public TransparentShape(T shape, int transparency) {
        this.transparency = transparency;
        this.shape = shape;
    }

    @Override
    public String info() {
        return shape.info() + " has " + transparency + "% transparency";
    }
}
