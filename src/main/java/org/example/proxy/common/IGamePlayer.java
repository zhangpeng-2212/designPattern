package org.example.proxy.common;


/**
 * 游戏玩家接口
 */
public interface IGamePlayer {
    //1.登录
    public void login(String name,String password);

    //2.打怪
    public void killBoss();

    //3.升级
    public void upgrade();

}
