package org.example.flyweight;

/**
 * signInfo的扩展子类
 * 因为SignInfo的location和subject都是有个数限制的值，所以可以通过池功能存储共有的对象
 * 该扩展类，存在一个key字段
 */
public class SignInfoKey extends SignInfo{

    /**
     * 该key可以在池子获取对象，可以把location+subject后的字符串作为key值
     */
    private String key;

    public SignInfoKey(String key) {
        String[] strings = key.split(",");
        this.setLocation(strings[0]);
        this.setSubject(strings[1]);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    
}
