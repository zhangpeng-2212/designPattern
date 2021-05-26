package org.compare.behavior.command;


/**
 * 接收者接口，定义接收者公共方法，是真正去做事的人
 * 相当于厨师，在被服务员告知顾客订单后开始做菜
 *
 */
public interface IReceiver {

    public void compress(String source,String to);

    public void unCompress(String source,String to);

}
