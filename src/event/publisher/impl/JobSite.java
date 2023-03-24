package event.publisher.impl;

import event.observer.Observer;
import event.publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Publisher {
    private final List<Observer> observers;
    private final List<String> vacansies;

    public JobSite() {
        this.observers = new ArrayList<>();
        this.vacansies = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(List<Observer> observers) {
        for (Observer observer : observers) {
            observer.handleEvent(vacansies);
        }
    }

    public void addVacansy(String vacansy){
        this.vacansies.add(vacansy);
        notify(observers);
    }

    public void removeVacansy(String vacansy){
        this.vacansies.remove(vacansy);
        notify(observers);
    }


}
