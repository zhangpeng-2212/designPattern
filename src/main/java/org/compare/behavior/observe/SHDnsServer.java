package org.compare.create.observe;


/**
 * 上海dns服务器
 */
public class SHDnsServer extends DnsServer{
    @Override
    protected void sign(Recoder recoder) {
        recoder.setOwner("上海dns服务器");
    }

    @Override
    protected boolean isLocal(Recoder recorder) {
        return recorder.getDomain().endsWith(".sh.cn");
    }
}
