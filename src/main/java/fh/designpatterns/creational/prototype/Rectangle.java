package fh.designpatterns.creational.prototype;

/**
 * Created by filip on 18.5.15.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

