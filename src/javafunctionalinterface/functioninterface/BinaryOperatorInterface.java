package javafunctionalinterface.functioninterface;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorInterface {
    public static void main(String[] args){
        //operation-1 : number 1 + number 2
        //operation-2 : Square of the task1

        //making the operation 1
        BinaryOperator<Integer> integerBinaryOperator = (a,b) -> a + b;

        //making the operation 2
        Function<Integer,Integer> integerFunction = a -> a * a;

        //Applying both the operation
        Integer result = integerBinaryOperator.andThen(integerFunction).apply(1, 2);

        System.out.println(result);
    }
}
