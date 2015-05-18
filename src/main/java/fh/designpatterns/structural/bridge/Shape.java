package fh.designpatterns.structural.bridge;

/**
 * Created by filip on 18.5.15.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
