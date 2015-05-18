package fh.designpatterns.creational.singleton;

/**
 * Created by filip on 18.5.15.
 */
public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance;

    //make the constructor private so that this class cannot be instantiated
    private SingleObject(){}

    //Get the only object available thread safe
    public static synchronized SingleObject getInstance(){
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
