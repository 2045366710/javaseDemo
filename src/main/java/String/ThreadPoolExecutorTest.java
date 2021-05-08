package String;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Task implements Callable<String> {
    private String filename;

    public Task(String filename) {
        this.filename = filename;
    }
    
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("��� "+ filename);
        return "����ֵ" + filename;
    }
}

/**
 * ����һ���̳߳أ���50����������ȥ�����������Ϊ5
 * ���н��������ÿ���̷߳��صĽ���
 * title:ThreadPoolExecutorTest
 * descript:
 * @author liuzh
 * @date 2016��5��18�� ����8:16:26
 */
public class ThreadPoolExecutorTest {
    
    public void start() throws InterruptedException, ExecutionException {
        /**
         * �����̳߳أ����������Ϊ5
         * LinkedBlockingDeque����ʾִ��������߷������
         */
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(5, 10, 0,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        //�洢�̵߳ķ���ֵ
        List<Future<String>> results = new LinkedList<Future<String>>();
        
        for (int i = 0; i < 10; i++) {
            Task task = new Task(String.valueOf(i));
            System.out.println("�����̳߳أ�" + i);
            //����submit���Ի���̵߳ķ���ֵ
            Future<String> result = tpe.submit(task);
            results.add(result);
            
        }

        //�˺�����ʾ���ٽ���������
        //��������ã�awaitTermination��һֱ����
        tpe.shutdown();
        //1�죬ģ����Զ�ȴ�
        System.out.println(tpe.awaitTermination(1, TimeUnit.DAYS));

        //������
        for (int i = 0; i < 10; i++) {
            System.out.println(results.get(i).get());
        }

    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutorTest test = new ThreadPoolExecutorTest();
        test.start();
    }

}
