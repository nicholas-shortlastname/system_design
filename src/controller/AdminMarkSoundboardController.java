package controller;
import classes.Sound;
import classes.Soundboard;

/**
 * For Admins to mark a sound as not remotely available
 */
public class AdminMarkSoundboardController {
    final boolean hasPerms;
    public AdminMarkSoundboardController(boolean isAdmin){
        this.hasPerms = isAdmin;
    }
    public void markSound(Soundboard soundboard){
        if(hasPerms) {
            for (Sound sound : soundboard.getSounds()) {
                sound.setIfTagged(true);
            }
        }
    }
}
