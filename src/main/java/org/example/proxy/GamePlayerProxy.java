package org.example.proxy;


/**
 * 游戏代打
 */
public class GamePlayerProxy implements  IGamePlayer{
    /**
     * 被代理的游戏者
     */
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String name, String password) {
        before();
        this.gamePlayer.login(name, password);
    }

    @Override
    public void killBoss() {
        before();
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        before();
        this.gamePlayer.upgrade();
    }

    /**
     * 被代理对象被扩展部门，代理者可以实现自己的业务逻辑
     */
    public void before(){
        System.out.println("我是游戏代练，但是管理员不知道");
    }

}
