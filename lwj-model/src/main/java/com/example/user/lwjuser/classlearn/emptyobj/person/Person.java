package com.example.user.lwjuser.classlearn.emptyobj.person;

import com.example.user.lwjuser.classlearn.emptyobj.Null;

/**
 * @author wejie110
 */
public class Person {
    public final  String first;
    public final  String last;
    public final String address;

    public Person(String first,String last,String address){
        this.first = first;
        this.last = last;
        this.address = address;
    }
    @Override
    public String toString(){
        return "real person:"+first+last+address;
    }

    public static class NullPerson extends Person implements Null {
        public NullPerson() {
            super("None", "None", "None");
        }
        @Override
        public String toString() {
            return "NullPerson";
        }
    }
    public static final Person NULL= new NullPerson();

}
