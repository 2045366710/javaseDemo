package enums;

public class Test {

    public static void main(String[] args) {

        choice(EnumTest.ONE);

        System.out.println(EnumTest.ONE.age);
    }

    public static void choice(EnumTest enumTest){
        switch(enumTest){
            case ONE:
                System.out.println("one");
                break;
            case TWO:
                System.out.println("two");
                break;
             default:
                 System.out.println("no");
        }

    }
}
