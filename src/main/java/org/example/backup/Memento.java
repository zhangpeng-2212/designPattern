package org.example.backup;

import java.util.Map;

/**
 * 备忘录实体对象，用于储存被备份对象的内部状态
 */
public class Memento {
    private Map<Object,Object> fieldMap;

    public Memento(Map<Object, Object> fieldMap) {
        this.fieldMap = fieldMap;
    }

    public Map<Object, Object> getFieldMap() {
        return fieldMap;
    }

    public void setFieldMap(Map<Object, Object> fieldMap) {
        this.fieldMap = fieldMap;
    }
}
