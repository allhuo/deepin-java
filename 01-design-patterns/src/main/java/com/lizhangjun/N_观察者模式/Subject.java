package com.lizhangjun.N_观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer o : observers){
            o.update();
        }
    }
}
