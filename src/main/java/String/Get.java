package String;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Get {
    //????????????????
    public static void main(String[] args) throws ClassNotFoundException {
        //????(???????????)
    	System.out.print(Math.round(-11.9));
    	System.out.print(2<<3);
    	
        Student stu = new Student();
        Class classobj1 = stu.getClass();
        System.out.println(classobj1.getName());
        //??????????????????-?????????
        Class classobj2 = Class.forName("String.Student");
        System.out.println(classobj2.getName());
        //????????????????
        Class classobj3 = Student.class;
        System.out.println(classobj3.getName());
        final int a1 =11;
        Integer a = new Integer(3);
        Integer b = 3;  // ??3???????Integer????
        int c = 3;
        System.out.println(a == b);
        List<String> list = new ArrayList<>();
        list.add("aa");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            it.next();
        	it.remove();
        }
        
        System.out.println(2<<3);
        System.out.println(getInt());
        System.out.println(hash("zhsngsan"));
        System.out.println(hash("zhsngsan"));
    }
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    
    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
        } finally {
            a = 40;
            //??????????????????????????????????????????????1??return???????????????????40
        }
        
        return a;

    }

}
