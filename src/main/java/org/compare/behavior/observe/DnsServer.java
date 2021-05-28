package org.compare.create.observe;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;


/**
 * DnsServer dns解析器，
 * 既是观察者Observer，其主要的是update方法，处理被观察者的请求
 * 也是被观察者Observable，其主要的是addObserver()、notifyObservers()方法，添加和请求观察者
 */
public abstract class DnsServer extends Observable implements Observer {


    //作为观察者处理请求，也就是接收到事件后的处理
    @Override
    public void update(Observable o, Object arg) {
        Recoder recoder=(Recoder) arg;
        //解析dns，自己先处理，处理不了交给上级
        if(isLocal(recoder)){
            recoder.setIp(genIpAddress());
        }else{
            responseFromUpperServer(recoder);
        }
        //找到对应的dns后会一级一级往下调用其sign()方法，类似于递归
        sign(recoder);
    }

    //作为被观察者，添加自己的上级服务器
    public void setUpperServer(DnsServer dnsServer){
        //清除观察者集合，重新添加观察者
        super.deleteObservers();
        super.addObserver(dnsServer);
    }


    //将请求交给上一级,也就是通知观察者
    private void responseFromUpperServer(Recoder recoder){
        //标记此 observable 对象为已改变的对象；现在 haschanged 方法将返回 true。
        super.setChanged();
        //通知 Observer对象,会调用自己的观察者的update方法
        super.notifyObservers(recoder);
    }

    //每个DNS服务器签上自己的名字
    protected abstract void sign(Recoder recoder);

    //判断当前dns服务器能否解析
    protected abstract boolean isLocal(Recoder recorder);

    //随机产生一个IP地址，工具类
    private String genIpAddress(){
        Random rand = new Random();
        String address = rand.nextInt(255) + "." + rand.nextInt(255) + "."+ rand.nextInt(255) + "."+ rand.nextInt(255);
        return address; }

}
