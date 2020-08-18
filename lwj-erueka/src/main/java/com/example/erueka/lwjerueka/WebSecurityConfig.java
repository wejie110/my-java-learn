package com.example.erueka.lwjerueka;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Security启用csrf，然后会对URL请求进行token验证，如果请求中没有token,浏览器会任务是非法网页的请求，然后就会拒绝。
* */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf().disable();
        super.configure(httpSecurity);
    }
}
