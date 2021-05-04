package functionalinterface.lamdas;
public class ConsolePrinter implements Printer{

    private String message;
    public ConsolePrinter(String message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println(message );
    }
}
