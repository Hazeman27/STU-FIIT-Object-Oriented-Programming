package app;

import resident.*;
import human.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Resident residentDefault = new Resident();
        Resident resident = new Resident("James Peterson", 180, 65);
        Resident residentClone = new Resident("James Peterson", 180, 65);

        ArrayList<Human> people = new ArrayList<Human>();

        people.add(new Human());
        people.add(new Human());
        people.add(new Human("Alexander Pierce", "12.12.2012"));
        people.add(new Human("Richard Marks", "23.05.1972"));

        for (Human human: people)
            Human.printInfo(human);
        
        System.out.println(resident);
        System.out.println(residentClone);
        System.out.println(residentDefault);
    }
}