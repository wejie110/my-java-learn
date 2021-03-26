package com.example.user.lwjuser.lambdalearn;

/**
 * @author wejie110
 * 递归方法必须是实例变量或静态变量,此处是用了实例变量
 */
public class RecursiveFibonacci {
    IntCall fib;

    RecursiveFibonacci() {
        fib = n -> n == 0 ? 0 :
                n == 1 ? 1 :
                        fib.call(n - 1) + fib.call(n - 2);
    }

    int fibonacci(int n) { return fib.call(n); }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for(int i = 0; i <= 10; i++) {
            System.out.println(rf.fibonacci(i));
        }
    }
}