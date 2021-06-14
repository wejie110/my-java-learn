package com.example.user.lwjuser.factorypattern.abstrfacpat;

/**
 * @author wejie
 */
public interface AbsCourseFactory {
    INote createNote();
    IVideo createVideo();
}
