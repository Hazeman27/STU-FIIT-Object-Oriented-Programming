package tij.exercise2;

public class Overload {

    public Overload() {
        System.out.println("Overload constructor...");
    }

    public Overload(String string) {
        System.out.println("Overload constructor..." + string);
    }

    public static void main(String[] args) {
        new Overload("is cool...");
    }
}