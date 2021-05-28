package org.compare.create.observe;

public class Recoder {

    //域名
    private String domain;
    //IP地址
    private String ip;
    //属主
    private String owner;

    public String getDomain() { return domain; }
    public void setDomain(String domain) { this.domain = domain; }
    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }
    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    //输出记录信息
    // @Override
    public String toString(){
        String str= "域名：" + this.domain; str = str + ",IP地址：" + this.ip; str = str + ",解析者：" + this.owner; return str; }
}
