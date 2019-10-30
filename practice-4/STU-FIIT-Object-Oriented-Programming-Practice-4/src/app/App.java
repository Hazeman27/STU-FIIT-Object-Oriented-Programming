package app;

import plane.*;
import places.*;
import privacy.*;

public class App {
    public static void main(String[] args) throws Exception {

        int[] coordinates = {25, 300, -87};

        Point point = new Point(coordinates);
        Block[] blocks = Block.createBlocks();

        Private p = new Private();

        // p.secret inaccessible because it is protected

        for (int i = 0; i < 10; i++)
            new Traveler();
    }
}