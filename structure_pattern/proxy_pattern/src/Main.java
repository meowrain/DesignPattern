public class Main {
    public static void main(String[] args) {

        ITV videoServiceProxy = new VideoServiceProxy(new VideoService());
        videoServiceProxy.listVideos();
        videoServiceProxy.getVideoInfo();
        videoServiceProxy.downloadVideo();
    }
}
