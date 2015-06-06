package fh.designpatterns.behavioral.memento;

/**
 * Created by filip on 6.6.15.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
