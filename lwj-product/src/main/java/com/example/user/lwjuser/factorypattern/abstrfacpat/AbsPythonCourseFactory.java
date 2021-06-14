package com.example.user.lwjuser.factorypattern.abstrfacpat;

/**
 * @author wejie
 */
public class AbsPythonCourseFactory implements AbsCourseFactory{
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
