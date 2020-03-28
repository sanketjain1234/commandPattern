package com.sanket.designPattern.receiverFileSystem;

public class UnixFileSystemReceiver implements IFileSysteReceiver {
    @Override
    public void openFile() {
        System.out.println("Unix: Opening File");
    }

    @Override
    public void closeFile() {
        System.out.println("Unix: Closing File");
    }

    @Override
    public void writeFile() {
        System.out.println("Unix: Writing File");
    }
}
