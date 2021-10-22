package javafunctionalinterface.predicateinterface;

import java.util.function.Predicate;

public class CombiningPredicateDemo {
    public static void main(String[] args){
        //task: check a given string as left and right braces '{' '}'

        String test_string = "{ronok}";
        String test_string2 = "{rono";
        String test_string3 = "{rono";

        //Making the criteria
        Predicate<String> hasLeftBraces = str -> str.contains("{");
        Predicate<String> hasRightBraces = str -> str.contains("}");

        //Applying the criteria
        //checking for both left and Right braces
        boolean andResult = hasLeftBraces.and(hasRightBraces).test(test_string);
        //checking for left OR right braces
        boolean orResult = hasLeftBraces.or(hasRightBraces).test(test_string2);
        //checking if the string does not contain the left braces
        boolean negateResult = hasLeftBraces.negate().test(test_string3);

        //printing results
        System.out.println(andResult);
        System.out.println(orResult);
        System.out.println(negateResult);

    }
}
