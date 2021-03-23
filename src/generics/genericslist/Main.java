package generics.genericslist;

public class Main {
    public static void main(String[] args)
    {
        GenericList genericList = new GenericList<Integer>();  // we can only pass reference types we can not pass primitive types
        genericList.add(1);
        genericList.add(4);
        System.out.println(genericList.get(1));
    }
}
