package org.example.factoryMethod.multipartFactory;

import org.junit.Assert;

/**
 * 黑人锻造工厂
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {

        return new BlackMan();
    }

}
