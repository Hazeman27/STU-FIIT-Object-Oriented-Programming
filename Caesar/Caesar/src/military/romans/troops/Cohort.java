package military.romans.troops;

import military.romans.officers.Centurion;
import military.troop.Troop;

import java.util.ArrayList;

public class Cohort extends Troop {
    
    public Cohort(ArrayList<Troop> centuries, Centurion centurion) {
        super("Cohort", centuries, centurion, 6);
    }
    
    public Cohort(ArrayList<Troop> centuries) {
        super("Cohort", centuries, 6);
    }

    public Cohort() {
        super("Cohort", null, 6);
    }
}