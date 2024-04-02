package controller;

import classes.Sound;
import classes.Soundboard;

/**
 * For Admins to mark a sound as remotely available
 */
public class AdminUnmarkSoundboardController {
    final boolean hasPerms;
    public AdminUnmarkSoundboardController(boolean isAdmin){
        this.hasPerms = isAdmin;
    }
    public void unmarkSound(Soundboard soundboard){
        if(hasPerms) {
            for (Sound sound : soundboard.getSounds()) {
                sound.setIfTagged(false);
            }
        }
    }
}
