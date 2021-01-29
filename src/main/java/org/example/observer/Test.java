package org.example.observer;

public class Test {

    public static void main(String[] args) {
        //被观察者
        Employer employer=new Employer();

        //2个观察者
        IObserver director1=new Director();
        IObserver director2=new Director();

        employer.addObserver(director1);
        //employer.addObserver(director2);

        employer.doSth1();
        employer.dosth2();

    }
}
