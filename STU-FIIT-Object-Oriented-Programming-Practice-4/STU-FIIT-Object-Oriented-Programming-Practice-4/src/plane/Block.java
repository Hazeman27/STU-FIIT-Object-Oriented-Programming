package plane;

public class Block {

    public int sideA;
    public int sideB;
    public int sideC;

    public Block(int sideA, int sideB, int sideC) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Block(int sideA, int sideB) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = 12;
    }

    public Block(int sideA) {

        this.sideA = sideA;
        this.sideB = 14;
        this.sideC = 12;
    }

    public Block() {

        this.sideA = 16;
        this.sideB = 14;
        this.sideC = 12;
    }

    public static Block[] createBlocks() {

        Block[] blocks = new Block[3];

        blocks[0] = new Block();
        blocks[1] = new Block(23);
        blocks[2] = new Block(25);

        return blocks;
    }
}