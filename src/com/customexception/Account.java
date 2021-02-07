package com.customexception;

import java.io.IOException;

public class Account
{
    private int balance = 10;

    public void withDraw(int withDrawAmount) throws InsufficientFundException
    {
        if(withDrawAmount>balance)
            throw new InsufficientFundException();
        else
            System.out.println("you are now Withdwaring :: "+withDrawAmount);
    }
}
