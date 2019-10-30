package street;

public class Street {

    private final int nameLength = 20;
    protected char[] name = new char[this.nameLength];
    protected final int buildLandCount = 100;
    protected Residence[] residences = new Residence[256];

    public Street(String name) {

        char[] nameCharArray = name.toCharArray();

        for (int i = 0; i < this.nameLength; i++)
            this.name[i] = nameCharArray[i];
    }
}