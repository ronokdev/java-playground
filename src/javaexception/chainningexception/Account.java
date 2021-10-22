package javaexception.chainningexception;

public class Account
{
    private int balance = 90;

    public void getMoney(int amount) throws AccountException
    {
        if(amount>balance)
            throw new AccountException(new InsufficientBalanceException("You do not have sufficient Credit Left in your account"));
    }
}
