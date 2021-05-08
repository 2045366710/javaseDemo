package lambda.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TestStream1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,7040,10,20,30,40,40,50,60,7040,50,60,70);
        //创建Stream
        Stream<Integer> stream = list.stream();

        //中间操作
        stream =stream.filter((elem)->{
            if(elem>30) return true;
            return false;
        }).distinct()
        .limit(4)
       .map(elem->elem+100)
         .skip(1)
                .sorted((x1,x2)->{
                    return x2-x1;
                })//?
       // .sorted()
        .sorted((x1,x2)->{
            return x1-x2;
        });//??????????????????

        //list.stream().sorted(Comparator.comparing(Student::getAge).reversed())
        // .stream().sorted(Comparator.comparing(Student::getAge).reversed());
        //终止操作
        stream.forEach(System.out::println);
    }
}
