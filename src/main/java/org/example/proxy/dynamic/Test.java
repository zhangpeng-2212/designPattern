package org.example.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Test {
    /**
     * jdk动态代理，代理者的类实现InvocationHandler接口，携带一个被代理者的内部属性
     * 通过Proxy.newProxyInstance()方法创建代理者
     * @param args
     */
    public static void main(String[] args) {
        IGamePlayer game = new GamePlayer("张三");
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(
                //参数1：被代理对象的类加载器class
                game.getClass().getClassLoader(),
                //参数2：被代理对象的所有接口class数组
                game.getClass().getInterfaces(),
                //参数3：实现InvocationHandler的类的实例，并且将被代理对象传入
                new MyInvocationHandler(game)
        );

        proxy.login("张三","12345");
        proxy.killBoss();
        proxy.upgrade();
    }

}
