package fh.designpatterns.creational.builder;

/**
 * Created by filip on 18.5.15.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
