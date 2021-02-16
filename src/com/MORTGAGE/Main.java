package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        var box1 = new TextBox();
        System.out.println(box1.hashCode());
        // we get this integer: 1452126962 and it is calculated based on the address of this object in memory
        // HASHCODE is NOT the address of the object in memory. the address of this object in memory goes
        // through a function called HASH FUNCTION. the job of this function is to get a value and
        // map it in a numeric value that we call a Hashcode.
        // hash codes are used in different situations and one of them is comparing objects for equality.
        // here we define another object to show it
        var box2 = box1;
        System.out.println(box2.hashCode());
        /*
        result:
        1452126962
        1452126962
         */
        System.out.println(box1.equals(box2)); // result: true
        // now I create another different object

        var box3 = new TextBox();
        System.out.println(box1.equals(box3)); // result : false; cause they are in different
        // locations in memory and they have different HASH CODES.

        // sometimes we do not want to compare the objects based on their hash code,
        // but based on their content. eg. if we have a point class. a 2 dimensional point has x & Y.
        // if we have 2 points with the same x & y... they are equal. so here we are not talking
        // about their hash codes. we are talking about the contents and
        // they are equal in terms of their contents
        /*
        * in these cases we can eg change the implementation of equals() method
        * we will learn it later
         */
        System.out.println(box1.toString());
        /*
        * it will return the STRING representation of an object
        * the fully qualified name of the class with package name +@ + hash Code represented as
        * an hexadecimal: a numbering system beyond our decimal numbering System.
        * decimal Nr: 0-9
        * hexadecimal: 0-9 , characters A-F
        * result: com.MORTGAGE.TextBox@568db2f2
        *
        * if the default implementation of .toString() method is not desirable we can change it. eg:
        * if you have a point class: you can change the toString() method so that it returns x & Y
        */
    }
}
