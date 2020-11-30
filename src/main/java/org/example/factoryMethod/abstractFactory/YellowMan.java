package org.example.factoryMethod.abstractFactory;

/**
 * 黄色人种
 */
public class YellowMan implements Human{
    @Override
    public void getColor() {
        System.out.println("黄人的皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄人说亚洲话");
    }
}
