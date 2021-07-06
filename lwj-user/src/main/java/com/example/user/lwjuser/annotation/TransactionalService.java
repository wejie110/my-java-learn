package com.example.user.lwjuser.annotation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

/**
 * @author wejie
 */
@Service
@Transactional
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TransactionalService {
    /**
     * @return 服务bean名称
     */
    String name() default "";
}
