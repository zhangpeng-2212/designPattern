package org.example.observer;


import java.util.List;

/**
 * 被观察者接口
 */
public interface IObservable {

    /**
     * 添加观察者
     * @param observer
     */
    void addObserver(IObserver observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(IObserver observer);

    /**
     * 通知所有观察者
     * @param context
     */
    void notifyAllObservers(String context);

}
