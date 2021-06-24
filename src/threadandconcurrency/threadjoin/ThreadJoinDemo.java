package threadandconcurrency.threadjoin;

public class ThreadJoinDemo {
    public static void main(String[] args){
        Thread fileDownloadThread = new Thread(new FileDownload());
        fileDownloadThread.start();

        try {
            /*
            * the 'fileDownloadThread.join' tells the current thread to wait for the completion of the previous thread we created
            * Here the current thread is the 'main thread'
            * The previous thread is the 'fileDownloadThread'
            * */
            fileDownloadThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("File download complete ready for Scanning");
    }
}
