package javathreadandconcurrency.multiplethreadstart;

public class FileDownload implements Runnable {

    @Override
    public void run() {
//        System.out.println("File Downloading ..");

        //printing the current thread information
        System.out.println("Start Thread ID :: "+Thread.currentThread().getId()+" Name :: "+Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println("Download Complete");
        System.out.println("END Thread ID :: "+Thread.currentThread().getId()+" Name :: "+Thread.currentThread().getName());
    }
}
