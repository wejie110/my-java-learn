package com.example.user.lwjuser.factorypattern.facmethodpat;

import com.example.user.lwjuser.factorypattern.ICourse;
import com.example.user.lwjuser.factorypattern.PythonCourse;

/**
 * @author wejie
 */
public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create4() {
        return new PythonCourse();
    }
}
