package org.example.backup;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 对象工具类，用于备份、恢复对象的每个属性
 */
public class BeanUtils {

    //把bean的所有属性及数值放入到Hashmap中
    public static Map<Object,Object> backupProp(Object bean,Class clazz) throws IllegalAccessException {
        if(bean==null){
            return null;
        }

        Map<Object,Object> fieldMap = new HashMap<>();
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field field:declaredFields){
            field.setAccessible(true);
            String fieldName=field.getName();
            Object fieldValue = field.get(bean);
            fieldMap.put(fieldName, fieldValue);
        }
        return  fieldMap;
    }

    //把HashMap的值返回到bean中
    public static void restoreProp(Object bean,Class clazz,Map<Object,Object> propMap) throws IllegalAccessException {
        if(bean==null){
            return;
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field field:declaredFields){
            field.setAccessible(true);
            String fieldName=field.getName();
            field.set(bean, propMap.get(fieldName));
        }
    }

}
