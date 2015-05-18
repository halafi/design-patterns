package fh.designpatterns.structural.facade;

import fh.designpatterns.creational.abstractfactory.Shape;
import fh.designpatterns.creational.abstractfactory.shapeImpl.Circle;
import fh.designpatterns.creational.abstractfactory.shapeImpl.Rectangle;
import fh.designpatterns.creational.abstractfactory.shapeImpl.Square;

/**
 * Created by filip on 18.5.15.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
