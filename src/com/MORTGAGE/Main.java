package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        /*
        * upcasting   : CASTING AN OBJECT TO ONE OF ITS SUPERTYPES / PARENTS
        * down casting: CASTING AN OBJECT TO ONE OF ITS SUBTYPES / CHILDREN
         */

        var control = new UIControl(true);
        show(control);
        /*
        * after running we get toString of the object: control
        * com.MORTGAGE.UIControl@6d03e736
        * com.MORTGAGE.UIControl@6d03e736
        * which are identical.
         */

    }

    // I define a method called show & give it a parameter of the type UIControl;
    // in this method we want only to print this object on the CONSOLE
    // but only main method will be compiled and we need to use this method then in MAIN METHOD
    public static void show(UIControl control){
        System.out.println(control);
        System.out.println(control.toString()); // these are equal
    }
}