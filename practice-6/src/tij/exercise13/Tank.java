package tij.exercise13;

public class Tank {

    private int fill;

    public Tank(int fill) {
        this.fill = fill;
    }

    public Tank() {
        this.fill = 0;
    }

    public int getFill() {
        return this.fill;
    }

    public void fill(int value) {
        this.fill += value;
    } 

    public void empty() {
        this.fill = 0;
    }

    public void finalize() {

        this.empty();
        System.out.println("Tank has been emptied and removed");
    }

    public static void main(String[] args) {
        new Tank(50);
    }
}