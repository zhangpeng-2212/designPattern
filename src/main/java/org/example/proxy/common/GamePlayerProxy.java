package org.example.proxy.common;


/**
 * 游戏代打，也实现游戏者接口
 */
public class GamePlayerProxy implements IGamePlayer {
    /**
     * 被代理的游戏者
     */
    private IGamePlayer gamePlayer;

    /**
     * 代理者的构造方法，在代理者内部创建被代理者
     * 这样就可以让客户端无法感知到被代理者的存
     */
    public GamePlayerProxy(String name) {
        gamePlayer=new GamePlayer(name);
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
