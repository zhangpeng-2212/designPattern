package org.example.bridge;

/**
 * 衣服，产品的具体子类
 */
public class Cloth extends Product{
    @Override
    void beProducted() {
        System.out.println("=====生产衣服");
    }

    @Override
    void beSelled() {
        System.out.println("=====销售衣服");
    }
}
