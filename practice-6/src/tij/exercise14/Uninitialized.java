package tij.exercise14;

// Also included exercise 15 and 16

public class Uninitialized {

    public int i;
    public char c;
    public String s;
    public String unitialized;
    public String initialized = "I'm a string that is initialized during definition...";

    public Uninitialized() {
        this.unitialized = "I'm a string that is initialized during construction...";
    }

    public static void main(String[] args) {

        Uninitialized uninitialized = new Uninitialized();

        System.out.println(uninitialized.i);
        System.out.println(uninitialized.c);
        System.out.println(uninitialized.s);
    }
}