package org.example.abstractFactoryMethod.myAbstract;

import org.example.abstractFactoryMethod.myInterface.Human;

/**
 * 黑色人种抽象类，包括黑人的公共特性
 */
public abstract class AbstractBlackMan implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人的皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人说非洲话");
    }
}
