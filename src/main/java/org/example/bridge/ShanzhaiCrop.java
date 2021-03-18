package org.example.bridge;


/**
 * 山寨工厂，不确定会生产、销售什么产品
 */
public class ShanzhaiCrop extends Crop{
    public ShanzhaiCrop(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("=====山寨工厂挣钱了");
    }
}
