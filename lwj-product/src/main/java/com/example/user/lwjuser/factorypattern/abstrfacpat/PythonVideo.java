package com.example.user.lwjuser.factorypattern.abstrfacpat;

public class PythonVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
