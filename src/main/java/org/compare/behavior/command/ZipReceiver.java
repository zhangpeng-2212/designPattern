package org.compare.behavior.command;

public class ZipReceiver implements IReceiver{
    @Override
    public void compress(String source, String to) {
        System.out.println(source+"--->"+to+" 使用zip压缩成功");
    }

    @Override
    public void unCompress(String source, String to) {
        System.out.println(source+"--->"+to+" 使用zip解压缩成功");
    }
}
