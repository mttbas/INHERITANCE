package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        /*
        * upcasting   : CASTING AN OBJECT TO ONE OF ITS SUPERTYPES / PARENTS
        * down casting: CASTING AN OBJECT TO ONE OF ITS SUBTYPES / CHILDREN
         */

        var control = new UIControl(true);
        var textBox = new TextBox(true, "any textBox object is a control object and is an Object so it inherits all the members in UIControl class & Object class");
        show(control);
    }

    /*
    * there is one problem after down casting the control object.
    * if above instead of show(textBox); we use show(control); and run it,
    * we get classcastexception:
    * class com.MORTGAGE.UIControl cannot be cast to class com.MORTGAGE.TextBox
    * REASON: every text box is a CONTROL OBJECT
    * but not every control object is necessarily a textBOX object, it could be
    * a dropdown list or a check box. so that is why we get an error here.
    * in fact when we give show control object:  show(control); which is more generic and we are
    * trying to CAST it to a more specialized type: like textBox, java can not do this.
    * HOW CAN WE PREVENT IT HAPPENING?
    * before this casting we need to make sure that the object that
    * is passed here at runtime : public static void show(UIControl control)
    * is an instance of TextBox class, then we can safely CAST IT as textBox
    * we type:
    * if ( control instanceof TextBox){
            var textBox = (TextBox)control;
            ((TextBox) control).setText("now we access text box methods");
        }
    * look down. run the code. this time we get no error.
    * run with show(textBox); and show(control); to see difference.
     */

    public static void show(UIControl control){
        if ( control instanceof TextBox){
            var textBox = (TextBox)control;
            ((TextBox) control).setText("now we access text box methods");
        }
        System.out.println(control);
        System.out.println(control.toString()); // these are equal
    }
}