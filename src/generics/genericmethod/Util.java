package generics.genericmethod;

public class Util {
    public <T extends Comparable<T>> T checkBalance(T first, T second)
    {
        //first.compareTo(second) returns POSITIVE integer if it's True, Otherwise it returns a negative integer
        return (first.compareTo(second)>1)?first:second;
    }

}
