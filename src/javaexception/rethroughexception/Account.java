package javaexception.rethroughexception;

import java.io.IOException;

public class Account
{
    public void checkBalance(float check) throws IOException
    {
        try{
            getBalance(check);
        }
        catch (IOException ioe)
        {
            System.out.println("error occurred while checking balance ");
            throw ioe;
        }

    }

    public void getBalance(float bal) throws IOException
    {
            if(bal >=0)
                System.out.println("Balance is Ok");
            else
                throw new IOException("Balance Can not be Below ZERO in getBalance");
    }
}
