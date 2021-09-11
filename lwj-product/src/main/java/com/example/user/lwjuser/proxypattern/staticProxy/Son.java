package com.example.user.lwjuser.proxypattern.staticProxy;

import com.example.user.lwjuser.proxypattern.Person;

/**
 * @author wejie
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子找对象要求：肤白貌美大长腿");
    }
}
