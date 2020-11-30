package org.example.factoryMethod.multipartFactory;

/**
 * 黑色人种
 */
public class BlackMan implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人的皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人说非洲话");
    }
}
