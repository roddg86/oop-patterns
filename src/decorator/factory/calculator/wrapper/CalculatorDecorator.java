package decorator.factory.calculator.wrapper;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.log.Logger;

public class CalculatorDecorator implements Calculable {
    private Calculable calc;
    private Logger logger;

    public CalculatorDecorator(Calculable calc, Logger logger) {
        this.calc = calc;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log("Суммирую " + calc.getResult() + " и " + arg);
        Calculable result = calc.sum(arg);
        logger.log("Результат: " + result.getResult());
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("Умножаю " + calc.getResult() + " и " + arg);
        Calculable result = calc.multi(arg);
        logger.log("Результат: " + result.getResult());
        return this;
    }

    @Override
    public int getResult() {
        return calc.getResult();
    }
}
