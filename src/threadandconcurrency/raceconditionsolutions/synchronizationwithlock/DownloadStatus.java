package threadandconcurrency.raceconditionsolutions.synchronizationwithlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    /*
    * Creating a lock object
    * using the ReentrantLock implementation of the Lock Interface
    * */
    private Lock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBites(){
        /*
        * we are using the lock() method to lock the totalBytes field,
        * by using the lock we are ensuring that only one thread at a time can access this field.
        * we are also using the try catch block to avoid deadlocking situation.
        * we are trying to increment the totalBytes field whether
        * there is an error OR no error, we are unlocking the lock in the finally block.
        *
        * */
        lock.lock();
        try{
            totalBytes++;
        }
        finally {
            lock.unlock();
        }
    }

}
