package lambda;

public interface LambdaTest5 {
    //有参有返回值
    public int test(int num);

    public static void main(String[] args) {
        //方式一
        LambdaTest5 lambdaTest5 =(num)->{
            return num+100;
        };
        System.out.println(lambdaTest5.test(100));

        //方式二 如果省略{}，需同时省略return
        LambdaTest5 lambdaTest51 = (num) ->num+100;
        System.out.println(lambdaTest51.test(5));
    }
}
