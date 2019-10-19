package military.romans.troops;

import military.romans.officers.Decanus;
import military.romans.Roman;
import military.troop.Troop;

public class Contubernium implements Troop {

    private final int romansMaxAmount = 7;
    private Roman[] romans = new Roman[this.romansMaxAmount];
    private Decanus decanus;
    
    public Contubernium(Roman[] romans, Decanus decanus) {

        this.initRomans(romans);
        this.decanus = decanus;
    }
    
    public Contubernium(Roman[] romans) {
        
        this.initRomans(romans);
        this.decanus = new Decanus();
    }

    public Contubernium() {
        
        this.initRomans(null);
        this.decanus = new Decanus();
    }

    public void initRomans(Roman[] romans) {

        if (romans == null) 
            for (int i = 0; i < this.romansMaxAmount; i++)
                this.romans[i] = new Roman();

        else
            for (int i = 0; i < this.romansMaxAmount; i++)
                this.romans[i] = romans[i];
    }

    public Roman[] getRomans() {
        return this.romans;
    }

    public Decanus getDecanus() {
        return this.decanus;
    }
 
    public void advance() {

    }

    public void retreat() {

    }

    public void engage() {

    }

    public void hold() {

    }

    public void changeFormation() {

    }

    public void receiveOrder() {

    }

    public void acceptOrder() {

    }

    public void rejectOrder() {

    }
}