package fh.designpatterns.structural.decorator;

import fh.designpatterns.creational.abstractfactory.Shape;
import fh.designpatterns.creational.abstractfactory.shapeImpl.Circle;
import fh.designpatterns.creational.abstractfactory.shapeImpl.Rectangle;

/**
 * Created by filip on 17.5.15.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}