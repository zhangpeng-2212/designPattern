package org.example.abstractFactoryMethod.myEntity;


import org.example.abstractFactoryMethod.myAbstract.AbstractWhiteMan;

/**
 * 白种人女性
 * 需实现公共类没有实现的方法，女性
 */
public class FemaleWhiteMan extends AbstractWhiteMan {
    @Override
    public void getSex() {
        System.out.println("我是白种人女性");
    }
}
