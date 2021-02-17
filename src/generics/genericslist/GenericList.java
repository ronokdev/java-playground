package generics.genericslist;

import java.util.Objects;

public class GenericList<T> {
    private T[] items = (T[])new Integer[10];
    private int count;

    public void add(T item){
       items[count] = item;
    }

    public T get(int index){
        return items[index];
    }
}
