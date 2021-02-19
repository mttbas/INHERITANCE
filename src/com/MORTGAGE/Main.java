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
        /*
       * what if instead of control object we pass a textBox object to our show method?
       * instead of show(control); I write show(textBox);  that is valid because:
       * every textBox object IS A control OBJECT as well.
       * this is UPCASTING. this textBox object automatically gets cast UIControl/ its PARENT
       *
       * in fact the show method is written for control objects but because
       * TextBox class extends UIControl & inherits all the features, and
       * any textBox object IS A control object.
       * the show method and the statements are valid for textBox objects
       * to see what happens run the code with show(control); & show(textBox);
       *
       *
       * any class directly or indirectly extends Object class & inherits all the features. so
       * any textBox object IS AN Object
       * any control object IS AN Object
       * so if in show method instead of UIControl type I use Object and run it, it is also valid
       * pls try it with
       * public static void show(Object control)
       * public static void show(UIControl control)
         */

    }

    // I define a method called show & give it a parameter of the type UIControl;
    // in this method we want only to print this object on the CONSOLE
    // but only main method will be compiled and we need to use this method then in MAIN METHOD
    public static void show(Object control){
        System.out.println(control);
        System.out.println(control.toString()); // these are equal
    }
}