package tij.exercise3;

import tij.exercise2.Overload;

// Also include exercise 4...

public class ReferencesArray {

    public static void main(String[] args) {

        Overload[] overloads = new Overload[15];

        for (int i = 0; i < 15; i++)
            overloads[i] = new Overload("object #: " + (i + 1));
    }
}