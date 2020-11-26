package proxy.refactoring_guru.downloader;

import proxy.refactoring_guru.media_library.ThirdPartyYouTubeLib;
import proxy.refactoring_guru.media_library.Video;

import java.util.HashMap;

public class YoutubeDownloader {

    private ThirdPartyYouTubeLib thirdPartyYouTubeLib;

    public YoutubeDownloader(ThirdPartyYouTubeLib thirdPartyYouTubeLib) {
        this.thirdPartyYouTubeLib = thirdPartyYouTubeLib;
    }

    public void renderVideoPage(String videoId) {
        Video video = thirdPartyYouTubeLib.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = thirdPartyYouTubeLib.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
