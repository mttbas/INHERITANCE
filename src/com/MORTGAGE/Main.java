package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        var control = new TextBox();
        control.disable();
        control.setText("see how we inherited the features in UIControl class");
        System.out.println(control.isEnabled());
        System.out.println(control.getText()); // to print it out we need a getter which I created beforehand.
    }
}
