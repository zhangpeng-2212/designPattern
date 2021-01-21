package org.example.decorator;

/**
 * 装饰器父类
 */
public abstract class Decorator extends Repotor{

    private Repotor repotor;

    public Decorator(Repotor repotor) {
        this.repotor = repotor;
    }

    @Override
    public void report() {
        this.repotor.report();
    }

    @Override
    public void signName(String name) {
        this.repotor.signName(name);
    }
}
