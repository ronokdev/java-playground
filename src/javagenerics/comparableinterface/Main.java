package javagenerics.comparableinterface;

public class Main {
    public static void main(String[] args)
    {
       User user = new User(30);
       User user1 = new User(40);

       if(user.compareTo(user1) > 0){
           System.out.println("user > user1");
       }
       else
       {
           System.out.println("user1 > user");
       }
    }
}
