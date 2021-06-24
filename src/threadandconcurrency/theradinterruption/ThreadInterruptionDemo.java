package threadandconcurrency.theradinterruption;

public class ThreadInterruptionDemo {
    public static void main(String[] args){
        Thread fileDownloadThread = new Thread(new FileDownload());
        fileDownloadThread.start();

        /*
        * Sending interruption request to the 'fileDownloadThread' after 2 Second of main thread Sleep
        * If we send an interruption request while a thread is in Sleep then, we will get an InterruptedException
        * */
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fileDownloadThread.interrupt();
    }
}
