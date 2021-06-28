package threadandconcurrency.racecondition;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBites(){
        totalBytes++;
    }
}
