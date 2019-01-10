package edu.ashish.structural.flyweight;

public final class Oval implements Shape {

    private String color;

    public Oval(String color) {
        this.color = color;
    }

    @Override
    public void draw(String colour) {
        System.out.println("Drawing Oval with color " + this.color);
        System.out.println("Drawing Oval with colour " + colour);
    }
}
