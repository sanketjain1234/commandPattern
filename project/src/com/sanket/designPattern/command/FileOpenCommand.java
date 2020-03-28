package com.sanket.designPattern.command;

import com.sanket.designPattern.receiverFileSystem.IFileSysteReceiver;

public class FileOpenCommand implements IFileCommand {

    public FileOpenCommand(IFileSysteReceiver fileSystem){
        this.fileSystem = fileSystem;
    }
    private IFileSysteReceiver fileSystem;
    @Override
    public void execute() {
        this.fileSystem.openFile();
    }
}
