package functionalinterface.predicateinterface;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {
    public static void main(String[] args){
        //check if a character have more than 5 letter

        //we are taking string input and return a Boolean output as the method 'test()' of Predicate Interface accept a BOOLEAN
        Predicate<String> stringPredicate = str -> str.length()>5;
        System.out.println(stringPredicate.test("Ronok"));

        Predicate<String> stringPredicateNew = str -> str.length()>5;
        System.out.println(stringPredicate.test("Farhan fuad Ronok"));
    }
}
