package org.example.bridge;

/**
 * 衣服工厂，可以明确生产销售的是衣服
 */
public class ClothCrop extends Crop{
    public ClothCrop(Cloth cloth) {
        super(cloth);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("====衣服工厂挣钱了");
    }
}
