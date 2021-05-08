package lambda.functioninterface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Consumer 消费型 accept
 * Supplier 供给型 apply
 * Function 函数式
 * Predicate 预言型
 */
public class TestFunctionInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        Collections.addAll(list,10,20,30,40,50,60);

        //匿名内部类
        Consumer consumer = new Consumer<Integer>(){
            @Override
            public void accept(Integer o) {
                System.out.println(o);
            }
        };
        list.forEach(consumer);

        list.forEach(System.out::println);


        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return null;
            }
        };


        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer o) {
                if(o<=50) return true;
                return false;
            }
        };
        list.removeIf(predicate);
        System.out.println(list);
        list.removeIf((elem)->{
            if(elem<=50) return true;
            return false;
        });

        System.out.println(list);


    }
}
