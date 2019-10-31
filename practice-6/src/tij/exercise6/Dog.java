package tij.exercise6;

// Also include exercise 7...

public class Dog {

    public String bark() {
        return "bark! bark!";
    }

    public String bark(String bark) {
        return "bark " + bark + "!";
    }

    public String bark(int n) {

        String bark = "";

        for (int i = 0; i < n; i++)
            bark += "bark! ";

        return bark;
    }

    public String bark(String bark, int n) {

        String fullBark = "";

        for (int i = 0; i < n; i++)
            fullBark += "bark " + bark + "! ";

        return fullBark;
    }

    public String bark(int n, String bark) {
        return this.bark(bark, n);
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        // System.out.println(dog.bark());
        // System.out.println(dog.bark("ZOOP"));
        // System.out.println(dog.bark(5));

        System.out.println(dog.bark(5, "ZOOP is cool"));
        System.out.println(dog.bark("ZOOP is cool", 5));
    }
}