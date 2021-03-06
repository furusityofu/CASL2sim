package jp.ac.fukuoka_u.tl.casl2emu.android;

import android.widget.Button;

/**
 * Created by furusho on 2016/09/20.
 */

public class Casl2AsyncInputConfig {

    char inputAddress = 0;
    int buttonNum = 0;
    int visibility = Button.INVISIBLE;

    public Casl2AsyncInputConfig(int buttonNum) {
        this.buttonNum = buttonNum;
    }


    public char getInputAddress() {
        return inputAddress;
    }

    public int getVisibility() {
        return visibility;
    }

    public Casl2AsyncInputConfig setVisibility(int visibility) {
        this.visibility = visibility;
        return this;
    }

    public void setInputAddress(char inputAddress) {
        this.inputAddress = inputAddress;
    }
}
