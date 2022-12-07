package com.example.user.lwjuser.fanxing.tongpeifu;

/**
 * @author wejie110
 */
public class Holder<T> {
    T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public Holder() {
    }

    public Holder(T item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object obj) {
        return item.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<>(new Apple());
        Apple d = appleHolder.get();
        appleHolder.set(d);
//        Holder<Apple>不可向上转型为Holder<Fruit> 但是可以转型为Holder<? extends Fruit>
//        Holder<Fruit> fruitHolder = appleHolder;
        Holder<? extends Fruit> fruitHolder = appleHolder;

//        给定边界后只会返回边界对象fruit,但是可以转型到别的子类型，但是要注意类型转换异常的风险
        Fruit f = fruitHolder.get();
        d = (Apple) fruitHolder.get();
//        set 方法不能工作于此 因为此时set的参数也是? extends Fruit 意味着可以是任何事物，而编译器无法验证任何事物的类型安全性
//        fruitHolder.set(new Apple());
//        fruitHolder.set(new Fruit());
        try {
            Orange c = (Orange) fruitHolder.get();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(fruitHolder.equals(d));
    }
}
