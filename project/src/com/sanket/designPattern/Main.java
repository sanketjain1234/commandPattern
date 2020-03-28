package com.sanket.designPattern;

import com.sanket.designPattern.command.FileCommandExecuter;
import com.sanket.designPattern.constants.CommandTypes;
import com.sanket.designPattern.receiverFileSystem.IFileSysteReceiver;
import com.sanket.designPattern.receiverFileSystem.UnixFileSystemReceiver;
import com.sanket.designPattern.receiverFileSystem.WindowsFSReceiver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        FileCommandExecuter executer = new FileCommandExecuter();

        IFileSysteReceiver unixOsReceiver = new UnixFileSystemReceiver();
        IFileSysteReceiver windowsOsReceiever = new WindowsFSReceiver();

        executer.executeCommand(CommandTypes.FILE_OPEN , unixOsReceiver);
        executer.executeCommand(CommandTypes.FILE_WRITE, unixOsReceiver);
        executer.executeCommand(CommandTypes.FILE_CLOSE,unixOsReceiver);

        executer.executeCommand(CommandTypes.FILE_OPEN, windowsOsReceiever);
        executer.executeCommand(CommandTypes.FILE_WRITE,windowsOsReceiever);
        executer.executeCommand(CommandTypes.FILE_CLOSE,windowsOsReceiever);

    }
}
