package org.example.abstractFactoryMethod.myEntity;

import org.example.abstractFactoryMethod.myAbstract.AbstractBlackMan;

/**
 * 黑种人男性
 * 需实现公共类没有实现的方法，男性
 */
public class MaleBalckMan extends AbstractBlackMan {
    @Override
    public void getSex() {
        System.out.println("我是黑种人女性");
    }
}
