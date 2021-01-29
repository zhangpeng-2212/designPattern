package org.example.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * 普通员工实体类，既要实现自己的主接口，也要实现被观察者接口
 *
 * 也可以直接继承jdk的java.util.observable类
 */
public class Employer implements IOther,IObservable{
    private List<IObserver> observers;

    public Employer() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(String context) {
        observers.forEach(observer -> {
            observer.doSthForYourAction(context);
        });
    }

    @Override
    public void doSth1() {
        String str="该员工在偷懒";
        System.out.println(str);
        notifyAllObservers(str);
    }

    @Override
    public void dosth2() {
        String str="该员工今天迟到了";
        System.out.println(str);
        notifyAllObservers(str);
    }
}
