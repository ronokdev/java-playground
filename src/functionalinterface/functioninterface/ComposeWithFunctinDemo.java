package functionalinterface.functioninterface;

import java.util.function.Function;

public class ComposeWithFunctinDemo {
    public static void main(String[] args){
        //Input:  key:value
        //First:  key=value
        //Second: {key=value}

        Function<String,String> removeColon = str -> str.replace(":","=");
        Function<String,String> addBracket = str -> "{"+str+"}";

        //Composing multiple function
        //System 1 with andThen
        System.out.println(removeColon.andThen(addBracket).apply("key:value"));
        //System 2 with Compose
        //for compose we have to execute the operation in reverse
        System.out.println(addBracket.compose(removeColon).apply("key:value"));
    }
}
