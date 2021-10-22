package javagenerics.wildcard;

import java.util.List;

public class Utils {
    // class capture extends User
    public void PrintUser(List<? extends User> userList){
       User x = userList.get(0);   // we can not store the value of x in instruction because capture and instruction are two different class
       //Instruction x1 = userList.get(0); // ERROR
       System.out.println(x);
    }
}
