package org.example.abstractFactoryMethod.myEntity;

import org.example.abstractFactoryMethod.myAbstract.AbstractWhiteMan;

/**
 * 白种人男性
 * 需实现公共类没有实现的方法，男性
 */
public class MaleWhiteMan extends AbstractWhiteMan {
    @Override
    public void getSex() {
        System.out.println("我是白种人女性");
    }
}
