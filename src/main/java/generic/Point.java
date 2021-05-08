package generic;

/***
 * 泛型类
 * @param <T>
 */
public class Point<T> {
//    E — Element，常用在java Collection里，如：List<E>,Iterator<E>,Set<E>
//    K,V — Key，Value，代表Map的键值对
//    N — Number，数字
//    T — Type，类型，如String，Integer等等
    private T x;
    private T y;
    public void setX(T x){
        this.x =x;
    }
    public void setY(T y){
        this.y = y;
    }
    public T getX(){
        return this.x;
    }
    public T getY(){
        return this.y;
    }


    public static void main(String[] args) {
        Point<Integer> p = new Point<Integer>();

    }
}
