package org.example.factoryMethod.human;

/**
 * 抽象工厂
 */
public abstract class AbstractHumanFactory {
    //抽象方法，接收一个Class类型，生产一个对应类型的实例对象
    public abstract <T extends Human> T createHuman(Class<T> clazz) throws IllegalAccessException, InstantiationException;


}
