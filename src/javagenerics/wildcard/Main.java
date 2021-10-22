package javagenerics.wildcard;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        User user = new User(10);
        User user1 = new User(22);

        List<User> listUser = new LinkedList<>();
        listUser.add(user);
        listUser.add(user1);

        Utils utils = new Utils();
        utils.PrintUser(listUser);

        Instruction instruction = new Instruction(44);
        List<Instruction> listInstruction = new LinkedList<>();
        listInstruction.add(instruction);
        utils.PrintUser(listInstruction);


    }
}
