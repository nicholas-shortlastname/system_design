package classes;

import java.util.LinkedList;

public class AllSounds {
    LinkedList<Sound> sounds = new LinkedList<Sound>();
    public void addSound(Sound sound){
        sounds.add(sound);
    }
    public LinkedList<Sound> getSounds() {
        return sounds;
    }
}
