package app;

import military.troop.Troop;
import military.romans.troops.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(Troop.fullSummary(new Legion()));
    }
}