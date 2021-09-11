package com.example.user.lwjuser.proxypattern.staticProxy;

import com.example.user.lwjuser.proxypattern.Person;

/**
 * 父亲作为儿子的代理帮助提前物色对象
 * @author wejie
 */
public class Father implements Person {
    private Son son;

    public Father(Son son){
        this.son = son;
    }
    @Override
    public void findLove(){
        System.out.println("父亲帮助儿子物色对象");
        this.son.findLove();
        System.out.println("双方都同意，开始交往");
    }
}
