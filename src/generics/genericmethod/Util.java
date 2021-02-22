package generics.genericmethod;

public class Util {
    public <T extends Comparable<T>> T checkBalance(T first, T second)
    {
        return (first.compareTo(second)>1)?first:second;
    }

}
