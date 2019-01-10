package edu.ashish.structural.flyweight;

public final class Line implements Shape {

    private String color;

    public Line(String color) {
        this.color = color;
    }

    @Override
    public void draw(String colour) {
        System.out.println("Drawing Line with color " + this.color);
        System.out.println("Drawing Line with colour " + colour);
    }
}
