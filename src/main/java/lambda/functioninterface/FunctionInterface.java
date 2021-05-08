package lambda.functioninterface;

/**
 * Consumer 消费型
 * Supplier 供给型
 * Function 函数式
 * Predicate 预言型
 */
@FunctionalInterface
public interface FunctionInterface {

    //第一个抽象方法
    public void method();

    static void method2(){

    }

    default void method3(){

    }

    public String toString();
}
