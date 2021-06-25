package threadpool;


import annotation.Table;

import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureTaskTest {
    static final Integer count = 16;
    private static final ExecutorService executorService = Executors.newFixedThreadPool(count);
    static  List<String> stringList = new ArrayList<>();
    static  List<List<String>> stringsList = new ArrayList<>();

    static {
        for (int i = 0; i < 47; i++) {
            stringList.add("String"+i);
        }
        int start = 0;
        int listSize=stringList.size();
        int remainder=listSize%count;
        int taskDataSize = listSize/count;
        System.out.println("taskDataSize"+taskDataSize);
        //平均分配task任务
        for(int i=0;i<count;i++,start+=taskDataSize){
            int end = start + taskDataSize;
            //最后如果有分配不均的，多余部分交给最后一个任务处理
            if(i==count-1){
                if(remainder!=0){
                    end=listSize;
                }
            }
            List<String> temp = new ArrayList<>();
            temp= stringList.subList(start,end);
            stringsList.add(temp);
        }
        System.out.println("stringList"+stringsList);


    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<FutureTask<Integer>> futureTasks = new ArrayList<>();
        for (int i = 0; i < stringsList.size(); i++) {
            Task<String> listTask = new Task(stringsList.get(i));
            FutureTask<Integer> futureTask  = (FutureTask<Integer>) executorService.submit(listTask);
            futureTasks.add(futureTask);
        }
        int total = 0;
        for (int i = 0; i < futureTasks.size(); i++) {
            Integer j = futureTasks.get(i).get();
            total = total+j;
        }
        System.out.println("total"+total);
    }




}


class Task<String> implements Callable<Integer> {
    private List<String> task;
    public Task(List<String> task){
        this.task = task;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println("执行线程name"+Thread.currentThread().getName());
        return task.size();
    }
}
