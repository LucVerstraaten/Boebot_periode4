package Controllers;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class SoundController {

    public static void playSound() {
        try {

            File audioFile = new File("resources/Star_Wars.wav");

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();

            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip audioClip = (Clip) AudioSystem.getLine(info);

            audioClip.open(audioStream);
            audioClip.start();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
