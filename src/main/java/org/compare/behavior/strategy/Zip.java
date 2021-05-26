package org.compare.behavior.strategy;


/**
 * zip算法，实现压缩算法接口
 */
public class Zip implements Algorithm{
    @Override
    public void compress(String source,String to) {
        System.out.println(source+"--->"+to+" 使用zip压缩成功");
    }

    @Override
    public void uncompress(String source,String to) {
        System.out.println(source+"--->"+to+" 使用zip解压缩成功");
    }
}
