package org.example.bridge;

/**
 * 工厂抽象父类
 */
public abstract class Crop {
    private Product product;

    /**
     * 接收product类，由什么产品来决定这是什么工厂
     * @param product
     */
    public Crop(Product product) {
        this.product = product;
    }

    /**
     * 工厂挣钱，先生产后销售
     */
    public void makeMoney(){
        product.beProducted();
        product.beSelled();
    }
}
