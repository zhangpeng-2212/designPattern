package org.example.mediator;

/**
 * 中介者能够做的事枚举类
 */
public enum MediatorSthEnum {
    BUY(1,"采购电脑"),
    SELL(2,"销售电脑"),
    OFFSELL(3,"折价销售"),
    CLEAR(4,"清除库存");

    private int code;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    MediatorSthEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
