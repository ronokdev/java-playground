package functionalinterface.functioninterface;

import java.util.function.Function;
import java.util.function.ToLongFunction;

public class FunctionInterfaceDemo {
    public static void main(String[] args){
        //Taking String as input, outputting Integer
        Function<String,Integer> integerFunction = str -> str.length();
        System.out.println(integerFunction.apply("Fuad"));

        //Taking Integer as input, Outputting Long
        ToLongFunction<Integer> integerToLongFunction = firstint -> Long.valueOf(firstint);
        System.out.println(integerToLongFunction.applyAsLong(73));
    }
}
