package com.example.user.lwjuser.fanxing.erasure;

/**
 * 创建类型实例 -模板模式
 */

abstract class GenericWithCreate<T> {
    final T element;

    GenericWithCreate() {
        element = create();
    }

    abstract T create();
}

class Need {
}

class Creator extends GenericWithCreate<Need> {

    @Override
    Need create() {
        return new Need();
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }

}

public class CreatorGeneric {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.f();
    }
}
