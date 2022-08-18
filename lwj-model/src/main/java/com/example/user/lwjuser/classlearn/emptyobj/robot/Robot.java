package com.example.user.lwjuser.classlearn.emptyobj.robot;

import com.example.user.lwjuser.classlearn.emptyobj.Null;

import java.util.List;

public interface Robot {
    String name();
    String model();
    List<Operation> operations();

    class Test{
        public static void test(Robot r){
            if(r instanceof Null){
                System.out.println("[Null Robot]");
            }
            System.out.println("robot name" + r.name());
            System.out.println("robot model" + r.model());
            for (Operation operation :r.operations()){
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
