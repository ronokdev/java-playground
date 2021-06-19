package streams.primitivestream;

import java.util.stream.IntStream;

public class PrimitiveStreamDemo {
    public static void main(String[] args){

        /*
        * Generating a IntStream from a range
        * when using rangeClosed the START and END number is INCLUSIVE
        * */
        IntStream.rangeClosed(1,3)
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        /*
         * Generating a IntStream from a range
         * when using range the START number is inclusive and END number is EXCLUSIVE
         * */
        IntStream.range(1,3)
                .forEach(i-> System.out.println(i));
    }
}
