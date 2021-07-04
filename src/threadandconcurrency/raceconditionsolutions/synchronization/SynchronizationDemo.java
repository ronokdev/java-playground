package threadandconcurrency.raceconditionsolutions.synchronization;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationDemo {
    public static void main(String[] args){
        /*
        * Steps
        * Demo of Race Condition in action
        * Create an object to store some value
        * Share the object with more than 1 thread
        * Check If the 'value' is accurate or not. In this case it should be '10000'
        * */

        //Creating a object to store some value
        DownloadStatus downloadStatus = new DownloadStatus();


        List<Thread> threads = new ArrayList<>();

        /*
        * Starting all the 10 threads all together.
        * */
        for (int i=0;i<10;i++){
            //Sharing the same 'downloadStatus' object with all the 10 threads
            Thread fileDownloadThread = new Thread(new FileDownload(downloadStatus));
            fileDownloadThread.start();
            threads.add(fileDownloadThread);
        }

        /*
        * After starting all the 10 threads
        * we are adding them in a list (line 29)
        * below we are iterating over all the thread added in the list and
        * for each thread in the list we are telling our main thread to wait for the finishing of that thread.
        * */
        for(Thread threadList : threads){
            try {
                threadList.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /*
        * we are printing the increment value
        * As we are running 10 threads and each thread we are incrementing the value by 1 for one-thousand times
        * so the output should be 1_000 * 10 = 10_000
        * But for RACE CONDITION we are not getting 10000
        * */
        System.out.println(downloadStatus.getTotalBytes());
    }
}
