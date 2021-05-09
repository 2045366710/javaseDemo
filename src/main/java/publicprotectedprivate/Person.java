package publicprotectedprivate;

public class Person {

    private static String name="zhangsan";  //只能本类访问

    static String sno="2000100000";//default 同一个包内
    protected static int age=10;  //同一个包内或子类

    public static double d =100l; //任何类都可以访问


    public static void main(String[] args) {
        String name =Person.name;

        int age = Person.age;

        String sno = Person.sno;

        double d = Person.d;
    }
}
