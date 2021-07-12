package com.example.user.lwjuser.service.impl;

import com.example.user.lwjuser.annotation.TransactionalService;
import com.example.user.lwjuser.entity.ShopStk;
import com.example.user.lwjuser.mapper.ShopStkMapper;
import com.example.user.lwjuser.service.ShopStkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.StandardAnnotationMetadata;
import org.springframework.core.type.classreading.AnnotationMetadataReadingVisitor;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ReflectionUtils;

import javax.xml.stream.FactoryConfigurationError;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.rmi.server.ObjID;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * 组合注解模式学习
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lwj
 * @since 2020-08-26
 */
@TransactionalService(name = "test")
public class ShopStkServiceImpl extends ServiceImpl<ShopStkMapper, ShopStk> implements ShopStkService {

    public static void main(String[] args) throws IOException {
        AnnotatedElement annotatedElement = ShopStkServiceImpl.class;
        TransactionalService transactionalService = annotatedElement.getAnnotation(TransactionalService.class);
//完全Java 反射实现 ReflectionUtils为java 反射工具类，选择无参数方法
        ReflectionUtils.doWithMethods(TransactionalService.class,
                method -> System.out.printf("@TransactionalService.%s() = %s\n",method.getName(),ReflectionUtils.invokeMethod(method,transactionalService)),
                method -> method.getParameterCount()==0);
        System.out.println("-----------------------------");

//完全java 反射实现 将Annotation接口的方法予以排除
        ReflectionUtils.doWithMethods(TransactionalService.class,
                method -> System.out.printf("@TransactionalService.%s() = %s\n",method.getName(),ReflectionUtils.invokeMethod(method,transactionalService)),
                method -> !method.getDeclaringClass().equals(Annotation.class));
        System.out.println("-----------------------------");

//获取所有元注解类型的集合
//        AnnotationMetadata annotationMetadata = new StandardAnnotationMetadata(ShopStkService.class);
        SimpleMetadataReaderFactory factory =new SimpleMetadataReaderFactory();
        MetadataReader metadataReader = factory.getMetadataReader(TransactionalService.class.getName());
        AnnotationMetadata annotationMetadata=metadataReader.getAnnotationMetadata();
        //获取所有的元注解类型（全类名）集合
        Set<String> metaAnnotationTypes = annotationMetadata.getAnnotationTypes().stream()
                .map(annotationMetadata::getMetaAnnotationTypes)
                .collect(LinkedHashSet::new,Set::addAll,Set::addAll);
        metaAnnotationTypes.forEach(metaAnnotation->{
            //读取元注解属性信息
            Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(metaAnnotation);
            if(!CollectionUtils.isEmpty(annotationAttributes)){
                annotationAttributes.forEach((name,value)->{
                    System.out.printf("注解@%s 属性%s = %s\n", ClassUtils.getShortName(metaAnnotation),name,value);
                });
            }
        });

    }
}
