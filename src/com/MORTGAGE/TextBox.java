package com.MORTGAGE;


/*
* to have this class inherit all the features that we implemented in UI Control class we simply type:
* extends UIControl after class NAME
* if you go in main class and replace UIControl with TextBox, this OBJECT will will have 5 methods
* 2 methods in TextBox class + 3 methods in UIControl class
* just type the control object name with dot operator to see the members
 */

public class TextBox extends UIControl {
    /*
    *we have 1 FIELD
    *at first it was : public String text; but if we do not initialize it we may get problem
    *when creating OBJECTS. see the EXAMPLE OBJECTS
     */
    private String text = "";

    public TextBox(boolean isEnabled, String text) {
        super(isEnabled); // super() keyword to call the constructor of our base class;
        // must be first statement here. if not we get error.
        this.text = text;
        System.out.println("TextBox");
    }


    // and 2 methods
    public void setText(String text){
        this.text = text;
    }
    public void clear() {
        text = "";
    }

    public String getText() {
        return text;
    }
}
