package org.compare.behavior.command;

public class GzipUncompressCmd extends AbstractCmd{


    protected IReceiver gZipReceiver=new GzipReceiver();

    @Override
    public void execute(String source, String to) {
        this.gZipReceiver.unCompress(source, to);
    }
}
