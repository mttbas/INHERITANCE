package com.MORTGAGE;

public class UIControl {
    /*
    *we define a private boolean field.
    *all the UI CONTROLS should be enabled by DEFAULT
    */
    private boolean isEnabled = true;


    // what behaviors do we want to define here? the ability to enable or disable each UI CONTROL.
    public void enable() {
        isEnabled = true;
    }
    public void disable() {
        isEnabled = false;
    }
    public boolean isEnabled() {
        return isEnabled;
    }
    // our GETTER- gets the value for the field
    // the name of method and the name of the field are the same. it is OK. because these are different TYPES OF MEMBERS

}
