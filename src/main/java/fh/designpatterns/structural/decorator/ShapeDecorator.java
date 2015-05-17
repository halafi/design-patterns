package fh.designpatterns.structural.decorator;

import fh.designpatterns.creational.abstractfactory.Shape;

/**
 * Created by filip on 17.5.15.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}