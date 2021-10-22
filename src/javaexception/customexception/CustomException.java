package javaexception.customexception;

public class CustomException
{
    public static void main(String[] args)
    {
        Account account = new Account();
        try {
            account.withDraw(16);
        } catch (InsufficientFundException e) {
            e.getMessage();
        }
    }
}
