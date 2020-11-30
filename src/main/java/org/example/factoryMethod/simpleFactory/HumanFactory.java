package org.example.factoryMethod.simpleFactory;

import org.junit.Assert;

/**
 * 八卦炉，用来锻造具体的人类，内部有一个静态的创建方法
 */
public class HumanFactory{

    public static <T extends Human> T createHuman(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        Assert.assertNotNull("clazz不能为空",clazz);
        return (T) clazz.newInstance();
    }

}
