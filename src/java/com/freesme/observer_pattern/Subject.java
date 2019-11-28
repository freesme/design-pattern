package com.freesme.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 绑定观察者到Client对象和从Client对象解绑观察者的方法
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){

    }
}
