package org.example.abstractFactoryMethod.myEntity;


import org.example.abstractFactoryMethod.myAbstract.AbstractYellowMan;

/**
 * 黄种人女性
 * 需实现公共类没有实现的方法，女性
 */
public class FemaleYellowMan extends AbstractYellowMan {
    @Override
    public void getSex() {
        System.out.println("我是黄种人女性");
    }
}
