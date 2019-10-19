package places;

public class Traveler {

    public static int count = 0;

    public Traveler() {
        System.out.println("Travelers count:" + ++count);
    }
}