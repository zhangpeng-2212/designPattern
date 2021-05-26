package org.compare.behavior.strategy;


/**
 * 环境角色
 */
public class Context {
    private Algorithm algorithm;

    public Context(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void doCompress(String source,String to){
        algorithm.compress(source, to);
    }

    public void doUnCompress(String source,String to){
        algorithm.uncompress(source, to);
    }

}
