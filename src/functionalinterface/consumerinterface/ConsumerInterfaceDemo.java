package functionalinterface.consumerinterface;

import java.util.Arrays;
import java.util.List;

public class ConsumerInterfaceDemo {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(1,3,4);

        //This is one way of iterating through a List
        //This style is also known as Imperative Programming
        //for,if/else,switch/case is an example of Imperative programming
        for(Integer item:integerList){
            System.out.println(item);
        }

        System.out.println();

        //this forEach expects Consumer<? super Integer> and the Consumer is a Functional interface
        //For this we can represent it with Lamda Expression which takes an integer and does not return a Value.
        //This style of programming is known as Declarative programming
        integerList.forEach((Integer item )-> System.out.println(item));

    }
}
