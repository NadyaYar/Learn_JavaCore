package lesson25.task1;

public class TestClass<T, V, K> {

    public T doSomethingT(T t) {
        System.out.println("1");
        //logic1
        return t;
    }

    public V doSomethingV(V v) {
        System.out.println("2");
        //logic2
        return v;
    }

    public K doSomethingK(K k) {
        System.out.println("3");
        //logic3
        return k;
    }
}
