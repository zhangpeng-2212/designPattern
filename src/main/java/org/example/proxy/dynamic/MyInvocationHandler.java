package org.example.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 游戏代打，实现InvocationHandler接口，且要有一个被代理者的内部属性
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private IGamePlayer gamePlayer;
    //通过构造函数传递被代理对象
    public MyInvocationHandler(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    //代理后的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是游戏代练，但是管理员不知道");

        //执行被代理的方法
        return method.invoke(gamePlayer,args);
    }
}
