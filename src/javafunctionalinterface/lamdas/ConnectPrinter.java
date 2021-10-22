package javafunctionalinterface.lamdas;

public class ConnectPrinter implements Printer{
    private String message;
    public ConnectPrinter(String message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println(message);
    }
}
