package chess;

public class Game {

    protected int id;

    public Game(int i) {
        
        this.id = i;
        System.out.println("Game constructor...");
    }

    public void method() {
        System.out.println("Game method...");
    }
}