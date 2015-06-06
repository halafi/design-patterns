package fh.designpatterns.behavioral.visitor;

/**
 * Created by filip on 6.6.15.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
