package fh.designpatterns.creational.abstractfactory.shapeImpl;

import fh.designpatterns.creational.abstractfactory.Shape;

/**
 * Created by filip on 17.5.15.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}