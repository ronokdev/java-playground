package functionalinterface.supplierinterface;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void main(String[] args){
        //Supplier interface is a functional interface having one method 'get()' which takes no input and return an value of Type 'T'
        //So we are passing a lamda expression with no parameter
        //and returning an value of type Double.
        Supplier<Double> supplierDouble = ()-> {return Math.random();};

        //we have to call the 'get()' method in order to execute the lamda Function.
        System.out.println(supplierDouble.get());
    }
}
