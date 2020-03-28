package com.sanket.designPattern.receiverFileSystem;

public class WindowsFSReceiver implements IFileSysteReceiver {
    @Override
    public void openFile() {
        System.out.println("Windows: Opening File");
    }

    @Override
    public void closeFile() {
        System.out.println("Windows: Closing File");
    }

    @Override
    public void writeFile() {
        System.out.println("Windows: Writing File");
    }
}
