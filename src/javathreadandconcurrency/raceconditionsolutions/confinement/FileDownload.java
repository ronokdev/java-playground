package javathreadandconcurrency.raceconditionsolutions.confinement;

public class FileDownload implements Runnable {

    /*
    * Receiving the DownloadStatus object via Constructor
    * */
    private DownloadStatus downloadStatus;

    public FileDownload() {
        this.downloadStatus = new DownloadStatus();
    }

    @Override
    public void run() {
        for(int i=0;i<1_000;i++) {
            //Incrementing the value by 1 for one thousand time.
            downloadStatus.incrementTotalBites();
        }
    }

    public DownloadStatus getDownloadStatus() {
        return downloadStatus;
    }
}
