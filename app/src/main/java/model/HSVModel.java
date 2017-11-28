package model;

import java.util.Observable;

/**
 * Purpose/Description
 *
 * HSVModel holds the data.
 *
 * @author Ryan Radmore (radm0018@algonquinlive.com)
 */

public class HSVModel extends Observable {

    //Class variables
    public static final Integer MAX_HUE = 360;
    public static final float MAX_VALUE = 1;
    public static final float MAX_SATURATION = 1;
    public static final Integer MIN_HSV = 0;

    //Instance Variables
    private Integer hue;
    private float value;
    private float saturation;

    //No argument Constructor
    public HSVModel() { this(MAX_HUE, MAX_SATURATION, MAX_VALUE); }

    //Convenience constructor
    public HSVModel (Integer hue, float saturation, float value) {
        super();

        this.hue = hue;
        this.saturation = saturation;
        this.value = value;
    }

    public void asBlack()   { this.setHSV(0, 0, 0); }
    public void asRed()     { this.setHSV(0, 1, 1); }
    public void asLime()    { this.setHSV(120, 1, 1); }
    public void asBlue()    { this.setHSV(240, 1, 1); }
    public void asYellow()  { this.setHSV(60, 1, 1); }
    public void asCyan()    { this.setHSV(180, 1, 1); }
    public void asMagenta() { this.setHSV(300, 1, 1); }
    public void asSilver()  { this.setHSV(0, 0, 0.75f); }
    public void asGray()    { this.setHSV(0, 0, 0.5f); }
    public void asMaroon()  { this.setHSV(0, 100, 0.5f); }
    public void asOlive()   { this.setHSV(60, 1, 0.5f); }
    public void asGreen()   { this.setHSV(120, 1, 0.5f); }
    public void asPurple()  { this.setHSV(300, 1, 0.50f); }
    public void asTeal()    { this.setHSV(180, 1, 0.50f); }
    public void asNavy()    { this.setHSV(240, 1, 0.50f); }

    //Getters
    public float getSaturation() {
        return saturation;
    }

    public float getValue() {
        return value;
    }

    public Integer getHue() {

        return hue;
    }

    //Setters
    public void setHue(Integer hue) {

        this.hue = hue;
        this.updateObservers();
    }

    public void setSaturation(float saturation) {

        this.saturation = saturation;
        this.updateObservers();
    }

    public void setValue(float value) {

        this.value = value;
        this.updateObservers();
    }

    public void setHSV (Integer hue, float saturation, float value) {

        this.hue = hue;
        this.saturation = saturation;
        this.value = value;

        this.updateObservers();
    }

    private void updateObservers() {

        this.setChanged();      // sets a flag on this data
        this.notifyObservers(); // broadcast to all listeners
    }

}
