package exception.chainningexception;

public class chainningException
{
    public static void main(String[] args)
    {
        Account account = new Account();
        try {
            account.getMoney(100);
        } catch (AccountException e) {
            System.out.println(e.getCause().getMessage());
            e.printStackTrace();
        }
    }
}
