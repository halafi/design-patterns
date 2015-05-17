package fh.designpatterns.creational.abstractfactory;

import fh.designpatterns.creational.abstractfactory.colorImpl.Blue;
import fh.designpatterns.creational.abstractfactory.colorImpl.Green;
import fh.designpatterns.creational.abstractfactory.colorImpl.Red;

/**
 * Created by filip on 17.5.15.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        return null;
    }
}
