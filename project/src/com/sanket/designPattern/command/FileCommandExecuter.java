package com.sanket.designPattern.command;

import com.sanket.designPattern.constants.CommandTypes;
import com.sanket.designPattern.receiverFileSystem.IFileSysteReceiver;

public class FileCommandExecuter {

    public void executeCommand(CommandTypes command, IFileSysteReceiver fileSystem){
        switch (command) {
            case FILE_OPEN: {
                fileSystem.openFile();
                break;
            }
            case FILE_WRITE: {
                fileSystem.writeFile();
                break;
            }
            case FILE_CLOSE: {
                fileSystem.closeFile();
                break;
            }
        }

    }

}
