package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        var textBox = new TextBox(true, "");

        /*
        * access modifier in JAVA:
        *
        * PUBLIC ACCESS MODIFIER = public members are accessible from OUTSIDE OF A CLASS
        * PRIVATE ACCESS MODIFIER = are not.
        *
        *
        * eg: in UIControl class we have field: private boolean isEnabled = true;
        * so if we create a new UIControl object and use dot operator we see only public methods
        * and not the private field.
        *
         */
        var control = new UIControl(true);
        // also know that PRIVATE MEMBERS ( FIELDS & METHODS ) are not inherited by subclasses.
        // so if I go to TextBox class and right after super() type: this. ---- then I never see
        // the private field isEnabled , among the list of members.
        // so private fields and methods ARE NOT INHERITED by subclasses like TextBox and are not
        // accessible outside of a class.
        // we use PRIVATE TO HIDE THE IMPLEMENTATION DETAILS of a class. so we can change the implementation
        // in future without impacting other classes.

        /*
        * PROTECTED ACCESS MODIFIERS= (is bad practice)
        * PUBLIC IN their PACKAGE & also accessible by child/sub classes in different packages
        * = so if in UIControl class we have
        * the field: protected boolean isEnabled = true; then as long as we are inside a package like
        * com.MORTGAGE this field is treated like PUBLIC field and all the other classes in this
        * package could see this protected field.
        *
        * to see : I change UIControl field to protected temporarily and in the main class I type
        * control. ---- to see fields and methods available: this time i see
        * the protected field isEnabled as well.
        *
        * if you go to another package this protected field is not accessible.
        * ok now:  I change the field again to private. because as i told, it is bad practice.
         */

        // DEFAULT ACCESS MODIFIER = package private
        // what happens if we remove access Modifier? not private, public or protected-
        // only we have : boolean isEnabled = true;
        // then this field is private outside this package and no class in other packages can
        // inherit it.


        // just stick to PRIVATE & PUBLIC ; THE OTHERS ARE CONFUSING.

    }
}