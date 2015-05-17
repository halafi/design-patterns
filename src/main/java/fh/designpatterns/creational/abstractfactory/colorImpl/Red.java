package fh.designpatterns.creational.abstractfactory.colorImpl;

import fh.designpatterns.creational.abstractfactory.Color;

/**
 * Created by filip on 17.5.15.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
