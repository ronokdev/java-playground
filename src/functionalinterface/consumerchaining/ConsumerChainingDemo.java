package functionalinterface.consumerchaining;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerChainingDemo {
    public static void main(String[] args){
        //Creating a String List
        List<String> stringList = Arrays.asList("a","b","c");

        //Creating different type of operation to execute on stringList
        Consumer<String> stringConsumer = (String item)-> System.out.println(item);
        Consumer<String> stringConsumerUpperCase = (String item)-> System.out.println(item.toUpperCase());
        Consumer<String> stringConsumerAddSpace = (String item) -> System.out.println();

        //We are chaining Operation sequentially on stringList
        stringList.forEach(stringConsumer.andThen(stringConsumerUpperCase).andThen(stringConsumerAddSpace));
    }
}
