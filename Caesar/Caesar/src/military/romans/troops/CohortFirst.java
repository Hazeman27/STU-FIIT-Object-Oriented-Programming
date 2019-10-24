package military.romans.troops;

import military.romans.officers.Centurion;
import military.troop.Troop;

import java.util.ArrayList;

public class CohortFirst extends Troop {
    
    public CohortFirst(ArrayList<Troop> centuries, Centurion centurion) {
        super("CohortFirst", centuries, centurion, 5);
    }
    
    public CohortFirst(ArrayList<Troop> centuries) {
        super("CohortFirst", centuries, 5);
    }

    public CohortFirst() {
        super("CohortFirst", null, 5);
    }
}