package org.example.responsibilityChain;

/**
 * 职员类
 */
public abstract class Employer {
    /**
     * 该职员的级别
     */
    private LevelEnum level;

    /**
     * 直属上级
     */
    private Employer higherLevel;

    /**
     * 请示上级,模板方法模式
     * @param levelCode
     */
    protected final void askHigher(int levelCode) {
        //如果请求小于我的职责范围，我就可以处理
        if(levelCode<this.level.getCode() || this.level.getCode()==3){
           this.myResponse();
        }else{
            //如果请求不小于我的职责范围，我只能请示上级领导
            System.out.println("我是"+this.level.getMessage()+"这个请求超出我的职责范围，我只能请示上级");
            higherLevel.askHigher(levelCode);
        }
    }

    /**
     * 处理请求，有子类实现
     */
    protected abstract void myResponse();


    public Employer(LevelEnum level, Employer higherLevel) {
        this.level = level;
        this.higherLevel = higherLevel;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public Employer getHigherLevel() {
        return higherLevel;
    }

    public void setHigherLevel(Employer higherLevel) {
        this.higherLevel = higherLevel;
    }
}
