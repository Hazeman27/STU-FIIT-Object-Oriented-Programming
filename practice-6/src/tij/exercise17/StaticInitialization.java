package tij.exercise17;

public class StaticInitialization {

    public static String staticString = "A static string...";
    public static String regularString;

    public static void stringInitializer() {
        regularString = "A string initialized by static method...";
    }

    public static void printStrings() {

        System.out.println(staticString);
        System.out.println(regularString);
    }

    public static void main(String[] args) {
        StaticInitialization.printStrings();
    }
}