package javathreadandconcurrency.raceconditionsolutions.confinement;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ConfinementDemo {
    public static void main(String[] args){

        /*
        * we have to create new status object for each of the threads
        * and after completion of the each Thread we have to combine the status value
        * and SUM it to get the actual Download status
        * which again must be 10_000 (1_000*10)
        * */

        List<Thread> threads = new ArrayList<>();

        /*
        * creating an list of FileDownload class because
        * we have to access the fileDownload object of each thread
        * And we can not access a fileDownload object which is inside the thread, after that that STOPS.
        * That's why we are going to add the fileDownload object to the FileDownloadList And
        * after all the threads stops we can access all the fileDownload object from the fileDownloadLIST.
        * */
        List<FileDownload> fileDownloadList = new ArrayList<>();

        for (int i=0;i<10;i++){
            // Creating new FileDownload object for each of the Threads
            FileDownload fileDownload = new FileDownload();
            // Adding the fileDownload object to the list
            fileDownloadList.add(fileDownload);
            
            Thread fileDownloadThread = new Thread(fileDownload);
            
            fileDownloadThread.start();
            threads.add(fileDownloadThread);
        }

        // waiting for all the Threads to Stop.
        for(Thread threadList : threads){
            try {
                threadList.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /*
        * we are accessing all the FileDownload Object from the FileDownloadList by Stream.
        * Summing all the Bytes.
        *
        * we are using a getter from the FileDownload object to get the value from the DownloadStatus object
        * */
        Optional<Integer> reduce = fileDownloadList.stream()
                                                    .map(fileDownload -> fileDownload.getDownloadStatus().getTotalBytes())
                                                    .reduce(Integer::sum);

        /*
        * Getting the actual summation of the Byte which is 10_000
        * */
        System.out.println(reduce.get());
    }
}
