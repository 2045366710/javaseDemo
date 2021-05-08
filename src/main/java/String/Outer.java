package String;

public class Outer {
	
	public static void main(String[]args){
		String a ="11";
		swap(a);
		System.out.println(a);
		a="33";
		System.out.println(a);
	}
	
	public static void swap(String a1){
		String b= "22";
		a1=b;
	}
    private void test(final int i) {
        new Service() {

			@Override
			public void method() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}

        };
    }
 }
 //匿名内部类必须继承或实现一个已有的接口 
 interface Service{
    void method();
    void method1();
}
