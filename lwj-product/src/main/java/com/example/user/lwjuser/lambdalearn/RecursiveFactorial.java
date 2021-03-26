package com.example.user.lwjuser.lambdalearn;
/**
 * @author wejie110
 * 递归方法必须是实例变量或静态变量,此处是用了静态变量
 */
interface IntCall {
    int call(int arg);
}
public class RecursiveFactorial {
     static IntCall fact;
    public static void main(String[] args) {
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for(int i = 0; i <= 10; i++) {
            System.out.println(fact.call(i));
        }

    }
}