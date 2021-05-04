package functionalinterface.lamdas;

public class LamdaDemo {
    public static void main(String[] args){
        greet(new ConsolePrinter("Please print in console"));
        greet(new ConnectPrinter("Please print in Printer"));

        // We are using the Anonymous Inner Class
        // It's 'anonymous' because this class does not have a Name
        // It's also 'Inner' because we are using it inside a Method
        greet(() -> System.out.println("This is printing from Anonymous Inner Class"));
        Printer printer = ()-> System.out.println("Another print from Anonymous Inner class");
        greet(printer);
    }

    public static void greet(Printer printer){
        printer.print();
    }

}

