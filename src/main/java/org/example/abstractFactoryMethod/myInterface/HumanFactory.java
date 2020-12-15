package org.example.abstractFactoryMethod.myInterface;

/**
 * 人类生产工厂,定义各色人种生产方法
 */
public interface HumanFactory {

    public Human createBlackMan();

    public Human createWhiteMan();

    public Human createYellowMan();
}
