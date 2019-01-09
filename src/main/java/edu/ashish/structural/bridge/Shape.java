package edu.ashish.structural.bridge;

public abstract class Shape {

    private IRenderer renderer;

    public Shape(IRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return String.format("Drawing %s with %s", getName(),
                renderer.whatToRenderAs());
    }
}
