package decorator.factory.calculator.factory;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.Calculator;
import decorator.factory.calculator.ICalculableFactory;
import decorator.factory.calculator.log.impl.ConsoleLogger;
import decorator.factory.calculator.wrapper.CalculatorDecorator;

public class CalculableFactoryWithLog implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        //обертка
        return new CalculatorDecorator(new Calculator(primaryArg),new ConsoleLogger());
    }
}
