package org.example.abstractFactoryMethod;

import org.example.abstractFactoryMethod.myEntity.FemaleHumanFactory;
import org.example.abstractFactoryMethod.myInterface.Human;
import org.example.abstractFactoryMethod.myInterface.HumanFactory;

public class Test {

    public static void main(String[] args) {
        HumanFactory femaleHumanFactory=new FemaleHumanFactory();

        Human femaleBlackMan=femaleHumanFactory.createBlackMan();

        femaleBlackMan.getColor();
        femaleBlackMan.talk();
        femaleBlackMan.getSex();

    }


}
