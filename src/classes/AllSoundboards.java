package classes;

import java.util.LinkedList;

public class AllSoundboards {
    LinkedList<Soundboard> soundboards = new LinkedList<Soundboard>();
    public void addSoundboard(Soundboard soundboard){
        soundboards.add(soundboard);
    }
    public LinkedList<Soundboard> getSoundboards() {
        return soundboards;
    }
}
