package org.compare.behavior.command;

public class GzipReceiver implements IReceiver{
    @Override
    public void compress(String source, String to) {
        System.out.println(source+"--->"+to+" 使用gzip压缩成功");
    }

    @Override
    public void unCompress(String source, String to) {
        System.out.println(source+"--->"+to+" 使用gzip解压缩成功");
    }
}
