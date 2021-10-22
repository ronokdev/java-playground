package javastreams.streamactions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamActionDemo {
    public static void main(String[] args){
        //creating a stream from Array
        System.out.println("Generating infinite stream from Array");
        int[] numbers = {1,2,3};
        Arrays.stream(numbers)
              .forEach(x-> System.out.println(x));


        System.out.println("Generating infinite stream from List");
        //Creating a stream from list
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(4);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);

        integerList.stream()
                   .forEach(x-> System.out.println(x));

        //Generate infinite Stream
        //System 1 using the Stream.generate
        System.out.println("Generating infinite stream with Stream Generate");
        Stream<Double> generate = Stream.generate(() -> Math.random());
        generate.limit(4)
                .forEach(x-> System.out.println(x));

        //Generate infinite Stream
        //System 2 using the UnaryOperator
        System.out.println("Generating infinite stream with UnaryOperator");
        UnaryOperator<Integer> integerFunction = n -> n+1;
        Stream.iterate(1,integerFunction)
                .limit(4)
                .forEach(x-> System.out.println(x));


        System.out.println("Generating and printing distinct stream element");
        integerList.stream()
                .distinct()
                .forEach(x-> System.out.println(x));

    }
}
