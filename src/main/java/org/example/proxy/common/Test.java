package org.example.proxy.common;

/**
 * 此为普通的代理模式，客户端不知道被代理者的存在
 */
public class Test {

    public static void main(String[] args) {
        IGamePlayer gamePlayerProxy=new GamePlayerProxy("张三");

        gamePlayerProxy.login("张三","12345");

        gamePlayerProxy.killBoss();

        gamePlayerProxy.upgrade();

    }


}
