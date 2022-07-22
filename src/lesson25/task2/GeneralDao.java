package lesson25.task2;

public class GeneralDao<T> {

    private final T[] array = (T[]) new Object[10];

    public T save(T t) throws Exception {
        validate(t);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = t;
                break;
            }
        }
        return t;
    }

    public T[] getAll() {
        return array;
    }

    private void validate(T t) throws Exception {
        if (t == null) {
            throw new NullPointerException("Please, choose your object");
        }
        if (array.length > 10) {
            throw new Exception("You have not enough memory");
        }

    }
}
