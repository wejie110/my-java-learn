package com.example.user.lwjuser.factorypattern;

/**
 * @author wejie
 */
public class JavaCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
