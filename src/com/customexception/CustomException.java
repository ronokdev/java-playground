package com.customexception;

public class CustomException
{
    public static void main(String[] args)
    {
        Account account = new Account();
        try {
            account.withDraw(6);
        } catch (InsufficientFundException e) {
            e.getMessage();
        }
    }
}
