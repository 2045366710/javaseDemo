package lambda;

public interface LambdaTest2 {
    //无参数无返回值
    public void test();

    public static void main(String[] args) {
        //方式一
        LambdaTest2 lambdaTest2 =()-> System.out.println("lambda调用");
        lambdaTest2.test();
        //方式二
        LambdaTest2 lambdaTest21 =()->{
            System.out.println("=============");
            System.out.println("lambda调用");
        };
        lambdaTest21.test();


    }
}
