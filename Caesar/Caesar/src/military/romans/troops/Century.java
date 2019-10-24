package military.romans.troops;

import military.romans.officers.Centurion;
import military.troop.Troop;
import java.util.ArrayList;

public class Century extends Troop {
    
    public Century(ArrayList<Troop> contuberniums, Centurion centurion) {
        super("Century", contuberniums, centurion, 10);
    }
    
    public Century(ArrayList<Troop> contuberniums) {
        super("Century", contuberniums, 10);
    }

    public Century() {
        super("Century", null, 10);
    }
}