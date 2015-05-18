package fh.designpatterns.creational.builder;

/**
 * Created by filip on 18.5.15.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}