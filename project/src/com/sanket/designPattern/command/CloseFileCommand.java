package com.sanket.designPattern.command;

import com.sanket.designPattern.receiverFileSystem.IFileSysteReceiver;

public class CloseFileCommand implements IFileCommand {

    private IFileSysteReceiver fileSystem;

    public CloseFileCommand(IFileSysteReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}
