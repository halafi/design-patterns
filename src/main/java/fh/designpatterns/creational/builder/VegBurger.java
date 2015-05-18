package fh.designpatterns.creational.builder;

/**
 * Created by filip on 18.5.15.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
