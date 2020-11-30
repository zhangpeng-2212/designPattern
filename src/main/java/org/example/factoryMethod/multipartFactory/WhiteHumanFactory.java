package org.example.factoryMethod.multipartFactory;

/**
 * 白人锻造工厂
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new WhiteMan();
    }

}
