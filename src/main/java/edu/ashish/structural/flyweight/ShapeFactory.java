package edu.ashish.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

import static edu.ashish.structural.flyweight.ShapeType.CIRCLE;
import static edu.ashish.structural.flyweight.ShapeType.LINE;
import static edu.ashish.structural.flyweight.ShapeType.OVAL;

public class ShapeFactory {

    private static final Map<ShapeType, Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType type) {

        Shape shape = shapes.get(type);

        if(null == shape) {
            switch(type) {
                case OVAL:
                    shape = new Oval("blue");
                    shapes.put(OVAL, shape);
                    break;
                case CIRCLE:
                    shape = new Circle("green");
                    shapes.put(CIRCLE, shape);
                    break;
                case LINE:
                    shape = new Line("black");
                    shapes.put(LINE, shape);
                    break;
            }
        }
        return shape;
    }
}
