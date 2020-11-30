package org.example.factoryMethod.multipartFactory;

/**
 * 抽象工厂
 */
public abstract class AbstractHumanFactory {
    //抽象方法，接收一个Class类型，生产一个对应类型的实例对象
    public abstract Human createHuman();


}
