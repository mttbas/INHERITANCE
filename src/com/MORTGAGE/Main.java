package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        /*
        * upcasting   : CASTING AN OBJECT TO ONE OF ITS SUPERTYPES / PARENTS
        * down casting: CASTING AN OBJECT TO ONE OF ITS SUBTYPES / CHILDREN
         */

        var control = new UIControl(true);
        var textBox = new TextBox(true, "any textBox object is a control object and is an Object so it inherits all the members in UIControl class & Object class");
        show(textBox);
    }

    public static void show(Object control){
        var textBox = (TextBox)control;
        ((TextBox) control).setText("now we access text box methods");
        System.out.println(control);
        System.out.println(control.toString()); // these are equal
    }
    /*
    * interesting PART: even though at runtime we are passing a textBox object: show(textBox);
    * at compile time, when we are coding show method, we do not have access to any of the methods
    * in our TextBox. so if we TYPE control. ---- you only see the members of the control class
    *
    * now WHAT IF WE WANNA WORK with one of the methods in TextBox CLASS?
    * WE NEED TO explicitly CAST THIS CONTROL TO TEXTBOX .... how?
    * var textBox = (TextBox)control; this is DOWN CASTING.
    * base / parent UIControl class can access child methods.
    * now we have access to text box methods. type: control.-- you see setText and clear methods as well
    * we set the text and run it, the answer is:
    * now we access text box methods
    * now we access text box methods
     */
}