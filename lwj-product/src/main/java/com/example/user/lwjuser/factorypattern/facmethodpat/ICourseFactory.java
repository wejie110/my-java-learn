package com.example.user.lwjuser.factorypattern.facmethodpat;

import com.example.user.lwjuser.factorypattern.ICourse;

/**
 * @author wejie
 */
public interface ICourseFactory {
    /**
     * 工厂方法模式
     * @return  课程
     */
    ICourse create4();
}
