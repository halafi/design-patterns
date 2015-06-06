package fh.designpatterns.behavioral.visitor;

/**
 * Created by filip on 6.6.15.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
