package lamdas;

public class LamdaDemo {
    public static void main(String[] args){
        greet(new ConsolePrinter("Please print in console"));
        greet(new ConsolePrinter("Please print in Printer"));

        // We are using the Anonymous Inner Class
        // It's 'anonymous' because this class does not have a Name
        // It's also 'Inner' because we are using it inside a Method
        greet(new Printer() {
            @Override
            public void print() {
                System.out.println("This is printing from Anonymous Inner Class");
            }
        });
    }

    public static void greet(Printer printer){
        printer.print();
    }

}

