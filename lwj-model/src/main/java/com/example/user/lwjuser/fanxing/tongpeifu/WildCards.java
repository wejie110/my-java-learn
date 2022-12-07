package com.example.user.lwjuser.fanxing.tongpeifu;

/**
 * 无界通配符
 *
 * @author wejie110
 */
public class WildCards {
    static void rawArgs(Holder holder, Object arg) {
//       warning  Unchecked call to 'set(T)' as a member of raw type 'com.example.user.lwjuser.fanxing.tongpeifu.Holder'
        holder.set(arg);
        holder.set(new WildCards());
//        Cannot resolve symbol 'T'
//        T t = holder.get();
//        ok but type information hsa been lost
        Object obj = holder.get();
    }

    static void unboundedArg(Holder<?> holder, Object arg) {
//        error set(capture of ?) in Holder<capture of ?> can not be applied to (Object))
//        holder.set(arg);
//        holder.set(new WildCards());
//        Cannot resolve symbol 'T'
//        T t = holder.get();
//        ok but type information hsa been lost
        Object obj = holder.get();
    }

    static <T> T exact1(Holder<T> holder) {
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        T t = holder.get();
        holder.set(arg);
        return t;
    }

    static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
//        error set(capture of ? extends T) in Holder<capture of ? extends T> can not be applied to (T))
//        holder.set(T);
        T t = holder.get();
        Object dd = holder.get();
        return t;
    }
    static <T> void wildSupertype(Holder<? super T> holder, T arg){
        holder.set(arg);
//        incompatible types : found object , required T
//        T t = holder.get();
//        ok but type information hsa been lost
        Object obj = holder.get();
    }

    public static void main(String[] args){
        Holder raw  =new Holder<Long>();
        Holder raw2 = new Holder();
        Holder<Long> qualified= new Holder<Long>();
        Holder<Long> qualified2= new Holder<>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<?> unbounded2 = new Holder<>();
        Holder<? extends Long> bounded = new Holder<Long>();
        Holder<? extends Long> bounded2 = new Holder<>();
        Long lng = 1L;
    }
}
