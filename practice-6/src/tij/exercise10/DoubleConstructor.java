package tij.exercise10;

public class DoubleConstructor {

    private DoubleConstructor(String string) {
        System.out.println("DoubleConstructor private constructor... " + string);
    }

    public DoubleConstructor() {
        
        this("is private");
        System.out.println("Double Constructor regular constructor");
    }

    public static void main(String[] args) {
        new DoubleConstructor();
    }
}