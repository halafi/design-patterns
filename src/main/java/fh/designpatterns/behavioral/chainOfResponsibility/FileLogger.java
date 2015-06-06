package fh.designpatterns.behavioral.chainOfResponsibility;

/**
 * Created by filip on 6.6.15.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
