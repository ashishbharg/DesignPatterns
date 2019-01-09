package edu.ashish.structural.bridge;

/**
 * Bridge patterns avoid cartesian product of different types of classes. In this example,
 * instead of creating different classes like VectorCircle, VectorTriangle, RasterCircle, RasterTriangle etc.,
 * shapes and renderer classes are written togather so that the change in one implementation class should not
 * affect another implementation and vice versa. Also we have avoided cartesian products of writing these
 * many classes.
 */
public class BridgeDemo {

    public static void main(String[] args) {

        IRenderer vectorRenderer = new VectorRenderer();
        IRenderer rasterRenderer = new RasterRenderer();
        Shape vectorCircle = new Circle(vectorRenderer);
        Shape vectorTriangle = new Triangle(vectorRenderer);
        Shape rasterCircle = new Circle(rasterRenderer);
        Shape rasterTriangle = new Triangle(rasterRenderer);
        System.out.println(vectorCircle);
        System.out.println(vectorTriangle);
        System.out.println(rasterCircle);
        System.out.println(rasterTriangle);
    }
}
