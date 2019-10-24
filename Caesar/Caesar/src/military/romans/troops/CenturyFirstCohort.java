package military.romans.troops;

import military.romans.officers.Centurion;
import military.troop.Troop;
import java.util.ArrayList;

public class CenturyFirstCohort extends Troop {
    
    public CenturyFirstCohort(ArrayList<Troop> contuberniums, Centurion centurion) {
        super("CenturyFirstCohort", contuberniums, centurion, 20);
    }
    
    public CenturyFirstCohort(ArrayList<Troop> contuberniums) {
        super("CenturyFirstCohort", contuberniums, 20);
    }

    public CenturyFirstCohort() {
        super("CenturyFirstCohort", null, 20);
    }
}