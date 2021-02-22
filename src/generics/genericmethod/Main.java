package generics.genericmethod;

public class Main {
    public static void main(String[] args)
    {
        Util util = new Util();
       // System.out.println(util.checkBalance(10,20));
        System.out.println(util.checkBalance(new User(12),new User(22)));
    }
}
