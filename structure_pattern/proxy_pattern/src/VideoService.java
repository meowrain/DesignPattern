public class VideoService implements ITV {
    @Override
    public void listVideos() {
        System.out.println("list Videos");
    }

    @Override
    public void getVideoInfo() {
        System.out.println("Video Info");
    }

    @Override
    public void downloadVideo() {
        System.out.println("Download Video");
    }
}
