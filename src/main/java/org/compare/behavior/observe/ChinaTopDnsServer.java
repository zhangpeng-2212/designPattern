package org.compare.create.observe;


/**
 * 中国 top dns服务器
 */
public class ChinaTopDnsServer extends DnsServer{
    @Override
    protected void sign(Recoder recoder) {
        recoder.setOwner("中国顶级dns服务器");
    }

    @Override
    protected boolean isLocal(Recoder recorder) {
        return recorder.getDomain().endsWith(".ch.cn");
    }
}
