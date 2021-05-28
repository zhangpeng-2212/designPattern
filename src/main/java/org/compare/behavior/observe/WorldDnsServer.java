package org.compare.create.observe;


/**
 * 世界 top dns服务器
 */
public class WorldDnsServer extends DnsServer {
    @Override
    protected void sign(Recoder recoder) {
        recoder.setOwner("世界顶级dns服务器");
    }

    @Override
    protected boolean isLocal(Recoder recorder) {
        return true;
    }
}
