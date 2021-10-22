package javathreadandconcurrency.theradinterruption;

public class FileDownload implements Runnable {

    @Override
    public void run() {
        System.out.println("File Downloading ..");

        //printing the current thread information
        System.out.println("Current Thread ID :: "+Thread.currentThread().getId()+" ,Name :: "+Thread.currentThread().getName());

        for(int i=0;i<Integer.MAX_VALUE;i++) {
            /*
            * Checking for Interruption request from the MAIN thread continuously
            * If getting an interruption request then STOPPING this Thread and Returning.
            * */
            if(Thread.currentThread().isInterrupted()){
                System.out.println("Received Thread Interruption request");
                System.out.println("Download Cancel");
                return;
            }
            System.out.println("Downloading Byte " +i);
        }

        System.out.println("Download Complete");
    }
}
