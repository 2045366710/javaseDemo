package lambda;

public interface LambdaTest3 {
    //有参数无返回值
    public void test(int num);

    public static void main(String[] args) {
        //方式一
        LambdaTest3 lambdaTest3 = System.out::println;
        lambdaTest3.test(100);

        //方式二
        LambdaTest3 lambdaTest31 =(num)-> System.out.println(num);
        lambdaTest31.test(200);

        //方式三
        LambdaTest3 lambdaTest32 = n->{
            System.out.println(11);
            n+=n;
            System.out.println(n);
        };
        lambdaTest32.test(200);



    }
}
