package publicprotectedprivate.impl;

import publicprotectedprivate.Person;

public class Student extends Person {

    public static void main(String[] args) {
        //String name =Person.name; 只能在当前类

        //String sno = Person.sno; 同一个包内才能访问
        int age = Person.age;


        double d = Person.d;
    }
}
