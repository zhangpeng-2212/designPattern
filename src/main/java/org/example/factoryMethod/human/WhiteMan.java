package org.example.factoryMethod.human;

/**
 * 白色人种
 */
public class WhiteMan implements Human{
    @Override
    public void getColor() {
        System.out.println("白人的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白人说美洲话");
    }
}
