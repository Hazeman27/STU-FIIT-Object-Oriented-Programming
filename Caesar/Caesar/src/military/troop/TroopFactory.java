package military.troop;

import military.romans.troops.*;

public class TroopFactory {

    public Troop getTroop(String troopType) {

        if (troopType == null)
            return null;

        if (troopType.equalsIgnoreCase("Contubernium"))
            return new Contubernium();

        if (troopType.equalsIgnoreCase("Century"))
            return new Century();

        if (troopType.equalsIgnoreCase("CenturyFirstCohort"))
            return new CenturyFirstCohort();

        if (troopType.equalsIgnoreCase("Cohort"))
            return new Cohort();

        if (troopType.equalsIgnoreCase("CohortFirst"))
            return new CohortFirst();

        if (troopType.equalsIgnoreCase("Legion"))
            return new Legion();
        
        return null;
    }
}