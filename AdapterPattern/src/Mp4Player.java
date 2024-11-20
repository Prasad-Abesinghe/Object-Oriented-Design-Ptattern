public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        //Do nothing, this player does not support VLC
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing MP4 file. Name: "+ filename);
    }
}
