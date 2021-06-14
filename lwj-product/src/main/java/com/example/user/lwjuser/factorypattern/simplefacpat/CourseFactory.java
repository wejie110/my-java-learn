package com.example.user.lwjuser.factorypattern.simplefacpat;

import com.example.user.lwjuser.factorypattern.ICourse;
import com.example.user.lwjuser.factorypattern.JavaCourse;
import com.example.user.lwjuser.factorypattern.PythonCourse;
import org.apache.commons.lang.StringUtils;

/**
 * @author wejie
 */
public class CourseFactory {
    /** 简单工厂 1 */
    public static ICourse create1(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if("python".equals(name)){
            return new PythonCourse();
        }else{
            return null;
        }
    }
    /**简单工厂 2 工厂类利用反射*/
    public static ICourse create2(String className){
        try {
            if(StringUtils.isNotBlank(className)){
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /** 简单工厂3 优化请求参数*/
    public static ICourse create3(Class<? extends ICourse> clazz){
        try {
            if(clazz!= null){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
