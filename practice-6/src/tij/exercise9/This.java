package tij.exercise9;

public class This {

    private void callMe() {
        System.out.println("You called me :)");
    }

    public void call() {

        this.callMe();
        callMe();
    }

    public static void main(String[] args) {
        new This().call();
    }
}