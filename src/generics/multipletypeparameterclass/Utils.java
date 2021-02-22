package generics.multipletypeparameterclass;

public class Utils {
    public static <T> void keyValue(T key, T value){
        System.out.println(key +"::"+ value);
    }
}
