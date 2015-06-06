package fh.designpatterns.behavioral.mediator;

/**
 * Created by filip on 6.6.15.
 */
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
