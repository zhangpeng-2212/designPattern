package org.compare.create.observe;

public class Test {

    public static void main(String[] args) {
        SHDnsServer shDnsServer=new SHDnsServer();
        ChinaTopDnsServer chinaTopDnsServer=new ChinaTopDnsServer();
        WorldDnsServer worldDnsServer=new WorldDnsServer();

        shDnsServer.setUpperServer(chinaTopDnsServer);
        chinaTopDnsServer.setUpperServer(worldDnsServer);



        //首先将给地址交给上海dns服务器，当其update方法内判断解析不了时，会交给上级，调用其update方法
        //依次类推，知道摸一个dns服务器可以解析，解析完之后，会调用该dns的sign()方法，然后一级一级往下调用其下一级的sign方法
        Recoder recoder=new Recoder();
        recoder.setDomain("****.com");
        shDnsServer.update(null, recoder);

        System.out.println(recoder.toString());

    }

}
