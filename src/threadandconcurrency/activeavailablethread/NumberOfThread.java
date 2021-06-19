package threadandconcurrency.activeavailablethread;

public class NumberOfThread {
    public static void main(String[] args){
        //Returns the number of active threads in this current process
        System.out.println("Number of active threads : "+Thread.activeCount());

        //Returns the total number of available threads in the current process
        System.out.println("Total number of available threads : "+Runtime.getRuntime().availableProcessors());
    }
}
