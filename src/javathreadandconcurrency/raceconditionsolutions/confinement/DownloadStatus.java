package javathreadandconcurrency.raceconditionsolutions.confinement;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBites(){
        totalBytes++;
    }
}
