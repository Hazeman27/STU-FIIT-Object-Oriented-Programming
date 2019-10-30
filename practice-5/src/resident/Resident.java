package resident;

public class Resident {

    private String name;
    private int height;
    private int weight;

    public Resident() {

        this.name = "Resident";
        this.height = 175;
        this.weight = 75;
    }

    public Resident(String name, int height, int weight) {

        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }
}