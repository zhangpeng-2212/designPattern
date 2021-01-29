package org.example.observer;

/**
 * 观察者接口
 */
public interface IObserver {

    /**
     * 对于被观察的动作做出回应
     */
    public void  doSthForYourAction(String context);

}
