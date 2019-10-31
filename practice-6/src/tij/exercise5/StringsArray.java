package tij.exercise5;

public class StringsArray {

    public static void main(String[] args) {

        int stringsLength = 13;
        String[] strings = new String[stringsLength];

        for (int i = 0; i < stringsLength; i++) {

            strings[i] = new String("I am a string with number " + i);
            System.out.println(strings[i]);
        }
    }
}