package String;

import java.util.List;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{

	@Override
	public Integer call(){
		return 1;
	} 
	
	public static void main(String[] args){
//		FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyCallable());
//		Thread thread = new Thread(futureTask);
//		thread.start();
		int a =10;
		System.out.println(--a);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(35/4);
		System.out.println(35/4%3);
		String a1 ="11";

	}
	
	public static int test(List<String> list){
		return 0;}
	
}
