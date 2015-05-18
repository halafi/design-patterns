package fh.designpatterns.creational.builder;

/**
 * Created by filip on 18.5.15.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
