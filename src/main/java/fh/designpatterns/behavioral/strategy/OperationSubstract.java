package fh.designpatterns.behavioral.strategy;

/**
 * Created by filip on 6.6.15.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
