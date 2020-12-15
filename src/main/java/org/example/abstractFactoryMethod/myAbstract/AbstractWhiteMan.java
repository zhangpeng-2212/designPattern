package org.example.abstractFactoryMethod.myAbstract;

import org.example.abstractFactoryMethod.myInterface.Human;

/**
 * 白人抽象类，包括白人的公共特性
 */
public abstract class AbstractWhiteMan implements Human {


    @Override
    public void getColor() {
        System.out.println("白人的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白人说美洲话");
    }
}
