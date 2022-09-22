package com.example.user.lwjuser.fanxing;

/**
 * 内部链式存储机制
 * 当调用 pop() 方法时，总是返回top.item 然后丢弃当前top所指的Node<T>，并将top转移到下一个Node<T>,除非碰到哨兵
 * @author wejie110
 */
public class LinkedStack<T> {
    private static class Node<U>{
        U item;
        Node<U> next;
        Node(){
            item = null;
            next =null;
        }
        Node(U item , Node<U> next){
            this.item = item;
            this.next = next;
        }
        // 末端哨兵
        boolean end(){
            return (item == null) && (next == null);
        }
    }
    private Node<T> top = new Node<T>();
    // 入栈
    public void push(T item){
        top = new Node<>(item,top);
    }
    // 出栈
    public T pop(){
        T result = top.item;
        if(!top.end()){
            top = top.next;
        }
        return result;
    }
    public static void main(String[] args){
        LinkedStack<String> ls = new  LinkedStack<String>();
        for(String s : "11111 222222 3333333!".split(" ")){
            ls.push(s);
        }
        String s;
        while (( s = ls.pop()) != null){
            System.out.println(s);
        }
    }

}
