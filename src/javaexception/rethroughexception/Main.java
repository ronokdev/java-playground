package javaexception.rethroughexception;

public class Main
{
    public static void main(String[] args)
    {
        Account account = new Account();

        try{
            account.checkBalance(-2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
