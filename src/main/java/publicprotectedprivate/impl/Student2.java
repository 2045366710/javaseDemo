package publicprotectedprivate.impl;

import publicprotectedprivate.Person;

public class Student2 {

    public static void main(String[] args) {
        //String name =Person.name; 只能在当前类


        //String sno = Person.sno; 只能同一个包
        //int age = Person.age;  只能同一个包或者其子类

        double d = Person.d; //任何类都可以
    }
}
