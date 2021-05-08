package lambda;

public interface LambdaTest1 {
    public void test();

    public static void main(String[] args) {
        //方式一
        LambdaTest1 lambdaTest1 = new Test();
        lambdaTest1.test();

        //方式二 匿名内部类
        LambdaTest1 lambdaTest111 = new LambdaTest1() {
            @Override
            public void test() {
                System.out.println("匿名内部类调用");
            }
        };
        lambdaTest111.test();
        //lambda表达式调用
        LambdaTest1 lambdaTest1111 = ()->System.out.println("lambda表达式调用") ;
        lambdaTest1111.test();

    }

}
class Test implements LambdaTest1{

    @Override
    public void test() {
        System.out.println("test 方法");
    }
}