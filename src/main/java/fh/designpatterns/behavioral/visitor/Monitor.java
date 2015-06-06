package fh.designpatterns.behavioral.visitor;

/**
 * Created by filip on 6.6.15.
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
