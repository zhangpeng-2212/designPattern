package org.example.proxy.force;

/**
 * 此为强制的代理模式，客户端不知道代理者的存在，
 * 通过被代理者获取代理者
 * 就像你找某位领导，领导让你先找他的秘书
 */
public class Test {

    public static void main(String[] args) {
        IGamePlayer gamePlayer=new GamePlayer("张三");
        IGamePlayer gamePlayerProxy=gamePlayer.getProxy();

        gamePlayerProxy.login("张三","12345");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();


    }


}
