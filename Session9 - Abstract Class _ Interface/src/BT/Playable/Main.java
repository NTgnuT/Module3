package BT.Playable;

public class Main {
    public static void main(String[] args) {
        Playable audioPlayer = new AudioPlayer();
        audioPlayer.play();

        Playable videoPlayer = new VideoPlayer();
        videoPlayer.play();

    }
}
