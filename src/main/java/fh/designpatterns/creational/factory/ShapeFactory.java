package fh.designpatterns.creational.factory;

import fh.designpatterns.creational.abstractfactory.Shape;
import fh.designpatterns.creational.abstractfactory.shapeImpl.Circle;
import fh.designpatterns.creational.abstractfactory.shapeImpl.Rectangle;
import fh.designpatterns.creational.abstractfactory.shapeImpl.Square;

/**
 * Created by filip on 17.5.15.
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}