package org.compare.behavior.command;

public class ZipCompressCmd extends  AbstractCmd{

    protected IReceiver zipReceiver=new ZipReceiver();
    @Override
    public void execute(String source, String to) {
        this.zipReceiver.compress(source, to);
    }
}
