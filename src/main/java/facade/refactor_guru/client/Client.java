package facade.refactor_guru.client;

import facade.refactor_guru.facade.VideoConversionFacade;

public class Client {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade=new VideoConversionFacade();
        videoConversionFacade.convertVideo("youtubevideo.ogg","mp4");
    }
}
