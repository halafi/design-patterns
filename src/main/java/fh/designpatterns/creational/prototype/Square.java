package fh.designpatterns.creational.prototype;

/**
 * Created by filip on 18.5.15.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
