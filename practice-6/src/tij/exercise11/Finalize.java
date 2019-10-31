package tij.exercise11;

public class Finalize {

    public void finalize() {
        System.out.println("I'm done, going home...");
    }

    public static void main(String[] args) {

        Finalize f = new Finalize();
        f.finalize();
    }
}