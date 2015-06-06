package fh.designpatterns.behavioral.chainOfResponsibility;

/**
 * Created by filip on 6.6.15.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}