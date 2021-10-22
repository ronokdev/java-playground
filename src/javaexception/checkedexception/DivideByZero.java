package javaexception.checkedexception;

public class DivideByZero
{
    public int division(int numerator,int denominator) throws NullOrEmptyException
    {
        if(denominator <= 0)
            throw new NullOrEmptyException("Denominator can not be Lower Than Zero");
        return numerator / denominator;

    }
}
