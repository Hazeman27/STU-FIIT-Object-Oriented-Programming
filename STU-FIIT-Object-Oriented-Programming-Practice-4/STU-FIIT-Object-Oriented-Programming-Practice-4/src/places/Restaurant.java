package places;

public class Restaurant {

    private int cooksCount;
    private int waitersCount;

    public int employeesCount() {
        return this.cooksCount + this.waitersCount;
    }
}