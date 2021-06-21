package threadandconcurrency.threadstart;

public class StartThreadDemo {

    public static void main(String[] args){

        //Printing the current Thread information
        System.out.println("Main Thread ID :: "+Thread.currentThread().getId()+" Name :: "+Thread.currentThread().getName());

        Thread thread = new Thread(new FileDownload());
        thread.start();
    }
}
