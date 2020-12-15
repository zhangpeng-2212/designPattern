package org.example.abstractFactoryMethod.myAbstract;


import org.example.abstractFactoryMethod.myInterface.Human;

/**
 * 黄色人种抽象类，包括黄人的公共特性
 */
public abstract class AbstractYellowMan implements Human {
    @Override
    public void getColor() {
        System.out.println("黄人的皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄人说亚洲话");
    }


}
