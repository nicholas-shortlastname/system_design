package classes;

import java.util.LinkedList;

/**
 * If I figure out how to implement this it could become the class for Soundboards
 */
public class Soundboard {
    LinkedList<Sound> sounds = new LinkedList<Sound>();
    public void addSound(Sound sound){
        sounds.add(sound);
    }
    public Sound getSound(int index){
        return sounds.get(index);
    }

    public LinkedList<Sound> getSounds() {
        return sounds;
    }
}
