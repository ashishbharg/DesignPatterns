package edu.ashish.structural.staticdecorator;

public class Square implements Shape {

    private int side;

    public Square() { }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "A square of side " + side;
    }
}
