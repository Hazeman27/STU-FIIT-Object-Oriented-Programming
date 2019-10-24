package military.romans.troops;

import military.soldier.Soldier;
import military.troop.Troop;

import java.util.ArrayList;

public class Contubernium extends Troop {
    
    public Contubernium(ArrayList<Soldier> soldiers, Soldier decanus) {

        super("Contubernium", decanus);
        initializeSoldiers(this.soldiers, soldiers, 7);
    }
    
    public Contubernium(ArrayList<Soldier> soldiers) {
        
        super("Contubernium");
        initializeSoldiers(this.soldiers, soldiers, 7);
    }

    public Contubernium() {
        
        super("Contubernium");
        initializeSoldiers(this.soldiers, null, 7);
    }
}