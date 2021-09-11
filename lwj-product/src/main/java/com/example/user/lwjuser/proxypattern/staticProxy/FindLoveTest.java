package com.example.user.lwjuser.proxypattern.staticProxy;

/**
 * 静态代理找对象测试类,父亲只能帮儿子找对象
 * 父亲，儿子需要共同实现person接口，
 * 静态代理：父亲作为儿子的代理，只能帮儿子这一种约定好的对象相亲
 * @author wejie
 */
public class FindLoveTest {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father(son);
        father.findLove();
    }
}
