package plane;

public class Point {

    private int[] coordinates;
    private int[] range = {-256, 256};

    public Point() {
        this.coordinates[0] = 13;
        this.coordinates[1] = -23;
        this.coordinates[2] = 0;
    }

    public Point(int[] coordinates) {

        if (this.isOutOfRange(coordinates))
            return;

        this.coordinates = coordinates;
    }

    private boolean isOutOfRange(int[] coordinates) {

        for (int coordinate: coordinates)
            if (coordinate < this.range[0] || coordinate > this.range[1]) {
                System.out.println("Coordinate " + coordinate + " is out of range!");
                return true;
            }

        return false;
    }

    public int[] getCoordinates() {
        return this.coordinates;
    }
}