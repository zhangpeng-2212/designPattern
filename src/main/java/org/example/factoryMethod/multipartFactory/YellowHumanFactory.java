package org.example.factoryMethod.multipartFactory;

/**
 * 黄人锻造工厂
 */
public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {

        return new YellowMan();
    }

}
