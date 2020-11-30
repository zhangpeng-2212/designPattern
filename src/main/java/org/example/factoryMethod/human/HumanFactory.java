package org.example.factoryMethod.human;

import org.junit.Assert;

/**
 * 八卦炉，抽象人类创造工厂的实现类，用来锻造具体的人类
 */
public class HumanFactory extends AbstractHumanFactory{

    @Override
    public <T extends Human> T createHuman(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        Assert.assertNotNull("clazz不能为空",clazz);
        return (T) clazz.newInstance();
    }

}
