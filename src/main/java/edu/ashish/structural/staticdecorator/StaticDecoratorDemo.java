package edu.ashish.structural.staticdecorator;

/**
 * This class binds the generics in such a way that constructor calling will be in order and
 * decorators cannot be dynamic. Hence, the decorators are static.
 */
public class StaticDecoratorDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape<Square> blueSquare = new ColoredShape<>(new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape<ColoredShape<Circle>> myCircle = new TransparentShape<>(
                new ColoredShape<>(new Circle(5), "green"), 50);
        System.out.println(myCircle.info());
    }
}
