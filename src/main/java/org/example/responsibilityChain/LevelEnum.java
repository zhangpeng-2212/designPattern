package org.example.responsibilityChain;

public enum LevelEnum {
    BOTTOM(1,"底层员工"),
    DIRECTOR(2,"主管"),
    BOSS(3,"大老板");

    private int code;

    private String message;

    LevelEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
