package edu.ashish.structural.flyweight;

public final class Circle implements Shape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(String colour) {
        System.out.println("Drawing Circle with color " + this.color);
        System.out.println("Drawing Circle with colour " + colour);
    }
}
