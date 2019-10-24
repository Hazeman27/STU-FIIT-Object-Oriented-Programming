package human;

import java.util.Scanner;

public class Human {

    public static int count = 0;
    public String name;
    public String birthDate;

    Scanner scanner = new Scanner(System.in);

    public Human(String name, String birthDate) {
        
        this.name = name;
        this.birthDate = birthDate;

        count++;
    }

    public Human() {

        System.out.println("Enter resident name: ");
        String name = scanner.next();

        System.out.println("Enter resident birthdate: ");
        String birthDate = scanner.next();

        this.name = name;
        this.birthDate = birthDate;

        count++;
    }

    public static void printInfo(Human human) {
        System.out.println(human.name + ", " + human.birthDate);
    }

    public static void printCount() {
        System.out.println(Human.count);
    }
}