package org.example.proxy.force;


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

    //4.返回代理对象
    public IGamePlayer getProxy();

}
