package classes;

import java.io.File;

/**
 * If I figure out how to implement this it could become the class for Sounds
 */
public class Sound {
    String name;
    final File soundFile;
    boolean tagged = false;
    public Sound(String name, File sound){
        this.name = name;
        this.soundFile = sound;
    }
    public boolean getIfTagged(){
        return tagged;
    }
    public void setIfTagged(boolean ifTagged){
        tagged = ifTagged;
    }

}
