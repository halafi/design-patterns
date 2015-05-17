package fh.designpatterns.creational.abstractfactory.colorImpl;

import fh.designpatterns.creational.abstractfactory.Color;

/**
 * Created by filip on 17.5.15.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
