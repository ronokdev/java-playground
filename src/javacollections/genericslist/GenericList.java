package javacollections.genericslist;

public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[])new Object[10];
    private int count;

    public void add(T item){
       items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }

    @Override
    public ListIterator<T> iterator()
    {
        return new ListIterator(this);
    }


    private class ListIterator<T> implements java.util.Iterator{

        private final GenericList<T> fullGenericList;
        private int index;
        public ListIterator(GenericList<T> genericList)
        {
           fullGenericList = genericList;
        }

        @Override
        public boolean hasNext()
        {
            return (index<fullGenericList.count);
        }

        @Override
        public T next()
        {
            return fullGenericList.items[index++];
        }
    }
}
