package com.example.user.lwjuser.fanxing.coffee;

import com.example.user.lwjuser.fanxing.Generator;

import java.util.Iterator;
import java.util.Random;


/**
 * @author wejie110
 */
public class CoffeeGenerator implements Generator<Coffee> , Iterable<Coffee> {

    private int size = 0;
    private static Random rand = new Random(47);
    private Class[] types = {Americao.class,Breve.class,Cappuccino.class,Lette.class,Mocha.class};

    public CoffeeGenerator(){
    }
    public CoffeeGenerator(int sz){
        size =sz;
    }
    @Override
    public Coffee next() {
        try {
            return (Coffee)types[rand.nextInt(types.length)].newInstance() ;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count-- ;
            //类名.this一般用于内部类调用外部类的对象时使用，因为内部类使用this.调用的是内部类的域和方法，为了加以区别，所以使用类名.this来加以区分
            return CoffeeGenerator.this.next();
        }
    }

    public static void main(String[] args){
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i=0;i<5;i++){
            System.out.println(gen.next());
        }
        System.out.println("-----------------------------------");
        for(Coffee co : new CoffeeGenerator(5)){
            System.out.println(co);
        }
    }
}
