package org.example.abstractFactoryMethod.myEntity;

import org.example.abstractFactoryMethod.myInterface.Human;
import org.example.abstractFactoryMethod.myInterface.HumanFactory;


/**
 * 男性人类生产工厂，负责各色人种的男性
 */
public class MaleHumanFactory implements HumanFactory {
    @Override
    public Human createBlackMan() {
        return new MaleBalckMan();
    }

    @Override
    public Human createWhiteMan() {
        return new MaleWhiteMan();
    }

    @Override
    public Human createYellowMan() {
        return new MaleYellowMan();
    }
}
