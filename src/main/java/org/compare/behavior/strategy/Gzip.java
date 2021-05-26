package org.compare.behavior.strategy;


/**
 * gzip算法，实现压缩算法接口
 */
public class Gzip implements Algorithm{
    @Override
    public void compress(String source,String to) {
        System.out.println(source+"--->"+to+" 使用gzip压缩成功");
    }

    @Override
    public void uncompress(String source,String to) {
        System.out.println(source+"--->"+to+" 使用gzip解压缩成功");
    }
}
