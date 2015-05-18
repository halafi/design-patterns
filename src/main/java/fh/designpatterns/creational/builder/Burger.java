package fh.designpatterns.creational.builder;

/**
 * Created by filip on 18.5.15.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}