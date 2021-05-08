package lambda.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TestStream2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,20,20,30,40,50,60,70);

        //创建流方式一
        Stream stream = list.stream();

        //方式二 并行流
        //stream =list.parallelStream();

        //方式三
       // stream =Stream.of(10,20,20,30,40,50,60,70);
        //方式四


    }
}
