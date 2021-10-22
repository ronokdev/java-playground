package javathreadandconcurrency.multiplethreadstart;

public class MultipleThreadStartDemo {

    public static void main(String[] args){

        //Printing the MAIN Thread information
        System.out.println("Main Thread ID :: "+Thread.currentThread().getId()+" Name :: "+Thread.currentThread().getName());

        for(int i=0;i<10;i++){
            Thread thread = new Thread(new FileDownload());
            thread.start();
        }

    }
}
