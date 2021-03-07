package JavaNetworking;

public interface ImageDownloadListener {
    default void downloadStart() {}

    default void downloadFinish(String fileName){}

    default void downloadError() {}
}
