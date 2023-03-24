package event.observer.impl;

import event.observer.Observer;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.printf("Dear %s!%n We have some changes in vacancies:%s%n", name, vacancies);
        System.out.printf("%n====================================%n");
    }
}
