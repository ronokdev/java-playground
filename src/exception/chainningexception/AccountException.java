package exception.chainningexception;

// This is an example of Checked Exception
public class AccountException extends Exception
{
    public AccountException(Throwable cause)
    {
        super(cause);
    }

    public AccountException(String message)
    {
        super(message);
    }
}
