package generics.basicgenericslist;

public class Main {
    public static void main(String[] args)
    {
        GenericList genericList = new GenericList<Integer>();  // we can only pass reference types we can not pass primitive types
        genericList.add(1);
        genericList.add(4);
        System.out.println(genericList.get(1));

        GenericList genericListNew = new GenericList<String>();  // we can only pass reference types we can not pass primitive types
        genericListNew.add("Ronok");
        genericListNew.add("Ratul");
        System.out.println(genericListNew.get(1));
    }
}
