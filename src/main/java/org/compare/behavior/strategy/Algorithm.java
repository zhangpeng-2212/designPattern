package org.compare.behavior.strategy;

/**
 * 压缩算法接口
 * 定义两个方法，压缩和解压缩
 */
public interface Algorithm {

    public void compress(String source,String to);

    public void uncompress(String source,String to);

}
