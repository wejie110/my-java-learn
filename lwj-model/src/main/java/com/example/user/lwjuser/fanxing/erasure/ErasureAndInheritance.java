package com.example.user.lwjuser.fanxing.erasure;

/**
 * 泛型擦除和继承
 * @author wejie110
 */
public class ErasureAndInheritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        Derived2 d2 = new Derived2();
        Object o = d2.get();
        d2.set(o);
    }
}
class GenericBase<T>{
    private T obj;
    public T get(){
        return obj;
    }
    public void set(T obj){
        this.obj = obj;
    }
}
class Derived1<T> extends GenericBase<T>{
}
/**
    Raw use of parameterized class 'GenericBase'
    参数化类型“GenericBase”的原始使用
*/
class Derived2 extends GenericBase{
}

//    Cannot resolve symbol 'T'
//class Derived3 extends GenericBase<T>{}
