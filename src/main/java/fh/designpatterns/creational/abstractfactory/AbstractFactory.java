package fh.designpatterns.creational.abstractfactory;

/**
 * Created by filip on 17.5.15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
