package com.example.user.lwjuser.factorypattern;

import com.example.user.lwjuser.factorypattern.abstrfacpat.AbsJavaCourseFactory;
import com.example.user.lwjuser.factorypattern.abstrfacpat.AbsPythonCourseFactory;
import com.example.user.lwjuser.factorypattern.facmethodpat.ICourseFactory;
import com.example.user.lwjuser.factorypattern.facmethodpat.JavaCourseFactory;
import com.example.user.lwjuser.factorypattern.facmethodpat.PythonCourseFactory;
import com.example.user.lwjuser.factorypattern.simplefacpat.CourseFactory;

import java.util.Objects;

/**
 * @author wejie
 */
public class MainTest {
    public static void main(String[] args){
        //简单工厂模式 1
        Objects.requireNonNull(CourseFactory.create1("java")).record();
        //简单工厂模式 2
        Objects.requireNonNull(CourseFactory.create2("com.example.user.lwjuser.factorypattern.JavaCourse")).record();
        //简单工厂模式 3
        Objects.requireNonNull(CourseFactory.create3(PythonCourse.class)).record();

        //工厂方法模式
        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse course = courseFactory.create4();
        course.record();

        courseFactory = new PythonCourseFactory();
        course = courseFactory.create4();
        course.record();

        //抽象工厂模式
        AbsJavaCourseFactory factory = new AbsJavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();

        AbsPythonCourseFactory factory1 = new AbsPythonCourseFactory();
        factory1.createNote().edit();
        factory1.createVideo().record();
    }
}
