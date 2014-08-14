package Objects;

import Utils.FileUtils;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import mp3player.MP3Player;

public class MP3Work {

    private final BasicPlayer player = new BasicPlayer();

    private String currentFileName;

    public void play(MP3 mp3, MP3Player mp3Player) {

        String fileName = mp3.getPath();
        
        try {
            
            if (fileName != null && fileName.equals(currentFileName) && player.getStatus() == BasicPlayer.PAUSED) {
                player.resume();
                return;
            }

            currentFileName = fileName;
            player.open(new File(fileName));
            player.play();
            mp3Player.setTitle(mp3.toString());

        }
        catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Work.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setVolume(int currentVolume, int maxVolume) {
        try {
            player.setGain(calcVolume(currentVolume, maxVolume));
        }
        catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Work.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pause() {
        try {
            player.pause();
        }
        catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Work.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void stop() {
        try {
            player.stop();
        }
        catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Work.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double calcVolume(int currentVolume, int maxVolume) {
        return (double) currentVolume / (double) maxVolume;
    }

}
