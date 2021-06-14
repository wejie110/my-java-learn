package com.example.user.lwjuser.factorypattern.facmethodpat;

import com.example.user.lwjuser.factorypattern.ICourse;
import com.example.user.lwjuser.factorypattern.JavaCourse;

/**
 * @author wejie
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create4() {
        return new JavaCourse();
    }
}
