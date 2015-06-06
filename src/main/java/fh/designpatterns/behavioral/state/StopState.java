package fh.designpatterns.behavioral.state;

/**
 * Created by filip on 6.6.15.
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
