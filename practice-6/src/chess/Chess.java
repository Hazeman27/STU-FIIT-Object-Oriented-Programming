package chess;

public class Chess extends BoardGame {

    public Chess() {

        super(13);
        System.out.println("Chess constructor...");

        method();
        System.out.println(id);
    }

    public static void main(String[] args) {
        new Chess();
    }
}