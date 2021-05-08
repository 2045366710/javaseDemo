package lambda;

public interface LambdaTest4 {

    //多个参数无返回值
    public void test(int num, String name);

    public static void main(String[] args) {

        //方式一
        LambdaTest4 lambdaTest4 =(int num,String name)->{
            System.out.println(num +"     "+name);
        };

        lambdaTest4.test(100,"lambda");

        LambdaTest4 lambdaTest41 =(n,name)->{
            System.out.println(n+"name");
        };
        lambdaTest41.test(200,"lambda");
    }
}
