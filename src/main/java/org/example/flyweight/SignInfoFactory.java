package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 对象工厂，通过池对象里的属性共享，避免产生过多的对象
 */
public class SignInfoFactory {
    private static Map<String,SignInfo> signInfoMap=new HashMap<String,SignInfo>();

    private static SignInfo getSignInfo(String key){
        SignInfo signInfo=null;
        if(signInfoMap.containsKey(key)){
            return signInfoMap.get(key);
        }
        signInfo=new SignInfoKey(key);
        signInfoMap.put(key, signInfo);
        return signInfo;
    }

}
