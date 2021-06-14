package com.example.user.lwjuser.factorypattern.abstrfacpat;

public class JavaVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
