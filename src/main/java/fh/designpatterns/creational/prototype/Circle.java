package fh.designpatterns.creational.prototype;

/**
 * Created by filip on 18.5.15.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
