package fh.designpatterns.behavioral.observer;

/**
 * Created by filip on 6.6.15.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
