package org.example.proxy.force;


/**
 * 真正的游戏玩家,实现游戏者接口
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    private IGamePlayer gamePlayerProxy;

    @Override
    public void login(String name, String password) {
        System.out.println(this.name+"登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"正在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name+"成功升级");
    }

    @Override
    public IGamePlayer getProxy() {
        gamePlayerProxy=new GamePlayerProxy(this);
        return gamePlayerProxy;
    }


}
