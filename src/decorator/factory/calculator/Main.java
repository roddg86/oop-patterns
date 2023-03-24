package decorator.factory.calculator;

import decorator.factory.calculator.factory.CalculableFactoryWithLog;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactoryWithLog();
        CalculatorView view = new CalculatorView(calculableFactory);
        view.run();
    }
}
