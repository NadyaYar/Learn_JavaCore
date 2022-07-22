package lesson24.tasks;

public class AbstractDao <T>{
    @SuppressWarnings("unchecked")
    private final T[] array =(T[]) new Object[5];

    public T save(T t){
        int index = 0;
        for(T el : array){
            if(el == null){
                array[index] = t;
            }
            index++;
        }
        return null;
    }

    public T[] getAll() {
        return array;
    }
}
