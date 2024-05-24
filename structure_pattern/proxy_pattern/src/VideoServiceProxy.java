public class VideoServiceProxy implements ITV{
    private VideoService videoService;
    public VideoServiceProxy(VideoService videoService) {
        this.videoService = videoService;
    }
    @Override
    public void listVideos() {
        System.out.println("Proxy: Before listVideos method");
        videoService.listVideos();
        System.out.println("Proxy: After listVideos method");
    }

    @Override
    public void getVideoInfo() {
        System.out.println("Proxy: Before getVideoInfo method");
        videoService.getVideoInfo();
        System.out.println("Proxy: After getVideoInfo method");
    }

    @Override
    public void downloadVideo() {
        System.out.println("Proxy: Before downloadVideo method");
        videoService.downloadVideo();
        System.out.println("Proxy: After downloadVideo method");
    }
}
