package org.example.abstractFactoryMethod.myEntity;

import org.example.abstractFactoryMethod.myInterface.Human;
import org.example.abstractFactoryMethod.myInterface.HumanFactory;

/**
 * 女性人类生产工厂，负责各色人种的女性
 */
public class FemaleHumanFactory implements HumanFactory {
    @Override
    public Human createBlackMan() {
        return new FemaleBlackMan();
    }

    @Override
    public Human createWhiteMan() {
        return new FemaleWhiteMan();
    }

    @Override
    public Human createYellowMan() {
        return new FemaleYellowMan();
    }
}
