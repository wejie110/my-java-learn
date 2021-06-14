package com.example.user.lwjuser.factorypattern.abstrfacpat;

/**
 * @author wejie
 */
public class AbsJavaCourseFactory implements AbsCourseFactory{
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
