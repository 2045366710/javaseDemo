package generic;

public class InfoImpl<T> implements Info<T>{
    private T var ;

    public InfoImpl(T var){
        this.var =var;
    }

    @Override
    public T getVar() {
        return var;
    }

    @Override
    public void setVar(T var) {
        this.var =var ;
    }

    public static void main(String[] args) {
        Info<String> i = new InfoImpl<String>("hello generic");
        System.out.println(i.getVar());
    }
}
