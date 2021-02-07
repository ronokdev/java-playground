package exception.checkedexception;

public class NullOrEmptyException extends RuntimeException
{
    public NullOrEmptyException()
    {
        System.out.println("Denominator should not be ZERO");
    }

    public NullOrEmptyException(String message)
    {
        super(message);
    }
}
