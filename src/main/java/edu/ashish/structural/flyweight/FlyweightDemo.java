package edu.ashish.structural.flyweight;

public class FlyweightDemo {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw("blue");

        Shape circle2 = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle2.draw("red");
    }
}
