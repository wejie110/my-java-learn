package com.example.user.lwjuser.factorypattern;

/**
 * @author wejie
 */
public class PythonCourse implements ICourse{

    @Override
    public void record() {
        System.out.println("录制python视频");
    }
}
