package tij.exercise19;

import java.util.Random;

public class TwoDArray {

    public static Random random = new Random();

    public static double[][] initArray(int rows, int cols, int rangeStart, int rangeEnd) {

        double[][] array = new double[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                array[i][j] = random.nextInt(rangeEnd - rangeStart) + rangeStart;

        return array;
    }

    public static void printArray(double[][] array, int rows, int cols) {

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                System.out.println(array[i][j]);
    }

    public static void main(String[] args) {

        TwoDArray.printArray(
            TwoDArray.initArray(3, 2, 20, 500), 3, 2
        );

        TwoDArray.printArray(
            TwoDArray.initArray(10, 10, 5, 10), 10, 10
        );

        TwoDArray.printArray(
            TwoDArray.initArray(5, 5, 10, 20), 5, 5
        );
    }
}