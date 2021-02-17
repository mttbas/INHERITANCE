package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        var textBox = new TextBox(true, "");

        // OVERRIDING METHODS = CHANGING THE IMPLEMENTATION OF A METHOD declared in the BASE class
        // there are times that we inherit a method from a base / parent class or Object class
        // but we are not happy with the implementation of the methods.we want to change it:
        // it is what we call METHOD OVERRIDING / CHANGING.

        // do not confuse this with METHOD OVERLOADING = it means declaring a method MULTIPLE TIMES
        // with different PARAMETERS OR SIGNATURES

        // here is an example of method overriding:
        // eg: .toString() method - if we print it out we get: com.MORTGAGE.TextBox@568db2f2
        System.out.println(textBox.toString());
        System.out.println(textBox); // they are similar.
        // I am not happy with the implementation of toString() method. I wanna change it.
        // i wanna print the text inside the Text Box.

        /* because we have a text box OBJECT so we go to TextBox class and there we type:
        * @Override
        * public String toString(){
        * return text;
        * }
        * then we define toString() as we want and override it.
         */

        textBox.setText("we set the text and see the new implementation of toString() method after overriding it ");
        System.out.println(textBox.toString());
        System.out.println(textBox);


        // now instead of com.MORTGAGE.TextBox@568db2f2 we get the text printed:
        // result: we set the text and see the new implementation of toString() method after overriding it
        // we overrode the toString() method :))))


    }
}