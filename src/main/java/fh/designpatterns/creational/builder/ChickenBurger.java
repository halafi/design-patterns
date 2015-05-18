package fh.designpatterns.creational.builder;

/**
 * Created by filip on 18.5.15.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
