package org.example.observer;


/**
 * 主管实体类，实现观察者接口
 *
 *也可以直接实现jdk的java.util.Observer接口
 */
public class Director implements IObserver{
    @Override
    public void doSthForYourAction(String context) {
        System.out.println("我是主管，我看到"+context+"，我得报告给老板");
    }
}
