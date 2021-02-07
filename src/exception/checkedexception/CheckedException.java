package exception.checkedexception;

public class CheckedException
{
    public static void main(String[] args)
    {
        DivideByZero divideByZero = new DivideByZero();

        try{
            System.out.println("Result :: "+ divideByZero.division(100,10)); // NO ERROR
            System.out.println("Result :: "+ divideByZero.division(100,0));  // ERROR
        }
        catch (NullOrEmptyException e){
            e.printStackTrace();
        }
    }
}
