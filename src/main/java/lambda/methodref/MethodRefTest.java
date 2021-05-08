package lambda.methodref;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.function.Supplier;

public class MethodRefTest {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhangsan");

        //匿名内部类
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return s.getName();
            }
        };
        System.out.println(supplier.get());
        Supplier supplier1 =s::getName;
        System.out.println(supplier1.get());

    }
}
class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}