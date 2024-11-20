
//Main class to demonstrate the Adapter Pattern
public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","song.mp3");  // Direct support
        audioPlayer.play("mp4", "video.mp4");    // Uses adapter
        audioPlayer.play("vlc", "movie.vlc");    // Uses adapter
        audioPlayer.play("avi", "clip.avi");     // Unsupported
    }
}