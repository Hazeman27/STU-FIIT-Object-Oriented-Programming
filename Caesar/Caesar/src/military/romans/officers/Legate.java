package military.romans.officers;

import military.soldier.Soldier;

public class Legate extends Soldier {

    private final int thinStripedTriubunesMaxAmount = 5;
    protected MilitaryTribune thickStripedTribune = new MilitaryTribune();

    protected MilitaryTribune[] thinStripedTribunes = new MilitaryTribune[
        this.thinStripedTriubunesMaxAmount
    ];

    public Legate(
        MilitaryTribune[] thinStripedTribunes, 
        MilitaryTribune thickStripedTribune
    ) {

        this.initThinStripedTribunes(thinStripedTribunes);
        this.thickStripedTribune = thickStripedTribune;
    }

    public Legate(MilitaryTribune[] thinStripedTribunes) {

        this.initThinStripedTribunes(thinStripedTribunes);
        this.thickStripedTribune = new MilitaryTribune();
    }

    public Legate() {

        this.initThinStripedTribunes(null);
        this.thickStripedTribune = new MilitaryTribune();
    }

    public void initThinStripedTribunes(MilitaryTribune[] thinStripedTribunes) {

        if (thinStripedTribunes == null)
            for (int i = 0; i < this.thinStripedTriubunesMaxAmount; i++)
                this.thinStripedTribunes[i] = new MilitaryTribune(); 

        else
            for (int i = 0; i < this.thinStripedTriubunesMaxAmount; i++)
                this.thinStripedTribunes[i] = thinStripedTribunes[i];
    }
}