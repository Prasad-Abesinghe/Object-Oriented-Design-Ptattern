public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String filename) {
        //Do nothing, this player does not support MP4
    }

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing VLC file. Name: "+ filename);
    }
}
