package org.example.proxy;

public class Test {

    public static void main(String[] args) {
        //游戏者
        IGamePlayer gamePlayer=new GamePlayer("张三");
        //游戏带练
        IGamePlayer gamePlayerProxy=new GamePlayerProxy(gamePlayer);
        //由代理者替被代理者进行任务，从外界看来是被代理者在完成的
        gamePlayerProxy.login("张三","12345");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();

    }



}
