package military.soldier;

import military.romans.officers.*;

public class OfficerFactory {

    public Soldier getLeader(String troopType) {

        if (troopType == null)
            return null;

        if (troopType.equalsIgnoreCase("Contubernium"))
            return new Soldier();

        if (troopType.equalsIgnoreCase("Century") ||
            troopType.equalsIgnoreCase("CenturyFirstCohort"))
            
            return new Centurion();

        if (troopType.equalsIgnoreCase("Cohort") ||
            troopType.equalsIgnoreCase("CohortFirst"))
            
            return new Centurion();

        if (troopType.equalsIgnoreCase("Legion"))
            return new Legate();
        
        return null;
    }
}