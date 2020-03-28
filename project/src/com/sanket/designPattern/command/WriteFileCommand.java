package com.sanket.designPattern.command;

import com.sanket.designPattern.receiverFileSystem.IFileSysteReceiver;

public class WriteFileCommand implements IFileCommand {

    private IFileSysteReceiver fileSystem;

    public WriteFileCommand(IFileSysteReceiver fileSystem){
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }
}
