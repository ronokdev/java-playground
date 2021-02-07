package exception.chainningexception;

// This is an example of Checked Exception
public class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException()
    {
        System.out.println("You have insufficient Balance");
    }
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}
