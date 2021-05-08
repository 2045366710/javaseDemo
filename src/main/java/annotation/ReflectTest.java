package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Class clazz = Student.class;
        //获取类上面的所有注解
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation:annotations){
            System.out.println(annotation);
        }

        //获取类上面指定的注解
        Annotation annotation = clazz.getAnnotation(Table.class);
        System.out.println(annotation);
        //获取定义在属性上的注解
        Field sno = clazz.getDeclaredField("age");
        Column annotation1 = sno.getAnnotation(Column.class);
        System.out.println(annotation1.columnType());
        System.out.println(annotation1.length());
        System.out.println(annotation1.name());

    }
}
