package com.customexception;

public class InsufficientFundException extends Exception
{
    public InsufficientFundException()
    {
        System.out.println("You have insufficient Balance");
    }

    public InsufficientFundException(String message)
    {
        super(message);
    }
}
