package fh.designpatterns.behavioral.chainOfResponsibility;

/**
 * Created by filip on 6.6.15.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
