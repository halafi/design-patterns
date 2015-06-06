package fh.designpatterns.behavioral.visitor;

/**
 * Created by filip on 6.6.15.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
