package military.troop;

import java.util.ArrayList;
import java.util.HashMap;

import military.soldier.Soldier;
import military.soldier.OfficerFactory;

public class Troop {

    protected static TroopFactory troopFactory = new TroopFactory();
    protected static OfficerFactory officerFactory = new OfficerFactory();
    protected static HashMap<String, String> troopTypes = new HashMap<String, String>();

    protected String type;
    protected Soldier officer;

    protected ArrayList<Troop> troops = new ArrayList<Troop>();
    protected ArrayList<Soldier> soldiers = new ArrayList<Soldier>();

    protected static void initialize(
        String troopType, 
        ArrayList<Troop> troops, 
        ArrayList<Troop> newTroops, 
        int troopsAmount
    ) {

        if (newTroops == null) 
            for (int i = 0; i < troopsAmount; i++)
                troops.add(troopFactory.getTroop(troopType));

        else
            for (int i = 0; i < troopsAmount; i++)
                troops.set(i, newTroops.get(i));
    }

    protected static void initializeSoldiers(
        ArrayList<Soldier> soldiers, 
        ArrayList<Soldier> newSoldiers, 
        int soldiersAmount
    ) {

        if (newSoldiers == null) 
            for (int i = 0; i < soldiersAmount; i++)
                soldiers.add(new Soldier());

        else
            for (int i = 0; i < soldiersAmount; i++)
                soldiers.set(i, newSoldiers.get(i));
    }

    public Troop(
        String type, 
        ArrayList<Troop> newTroops, 
        Soldier leader, 
        int troopsAmount
    ) {

        initializeTroopTypes();
        initialize(troopTypes.get(type), this.troops, newTroops, troopsAmount);

        this.type = type;
        this.officer = leader;

        this.soldiers = getAllSoldiers(type, this);
    }

    public Troop(
        String type, 
        ArrayList<Troop> newTroops, 
        int troopsAmount
    ) {

        initializeTroopTypes();
        initialize(troopTypes.get(type), this.troops, newTroops, troopsAmount);

        this.type = type;
        this.officer = officerFactory.getLeader(type);

        this.soldiers = getAllSoldiers(type, this);
    }

    public Troop(String type, Soldier leader) {

        this.type = type;
        this.officer = leader;

        this.soldiers = getAllSoldiers(type, this);
    }

    public Troop(String type) {

        this.type = type;
        this.officer = officerFactory.getLeader(type);

        this.soldiers = getAllSoldiers(type, this);
    }

    public String getType() {
        return this.type;
    }

    public Soldier getOfficer() {
        return this.officer;
    }

    public ArrayList<Troop> getTroops() {
        return this.troops;
    }

    public ArrayList<Soldier> getSoldiers() {
        return this.soldiers;
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

    public static void initializeTroopTypes() {

        troopTypes.put("Century", "Contubernium");
        troopTypes.put("CenturyFirstCohort", "Contubernium");
        troopTypes.put("Cohort", "Century");
        troopTypes.put("CohortFirst", "CenturyFirstCohort");
        troopTypes.put("Legion", "Cohort");
    }

    public static ArrayList<Soldier> getAllSoldiers(
        String troopType, Troop troop
    ) {

        if (troopType.equalsIgnoreCase("Century") ||
            troopType.equalsIgnoreCase("CenturyFirstCohort")) {
            
            for (Troop contubernium: troop.troops) {
                
                troop.soldiers.addAll(
                    getAllSoldiers("Contubernium", contubernium)
                );

                troop.soldiers.add(contubernium.officer);
            }
        }

        if (troopType.equalsIgnoreCase("Cohort") ||
            troopType.equalsIgnoreCase("CohortFirst")) {
            
            for (Troop century: troop.troops) {

                troop.soldiers.addAll(
                    getAllSoldiers("Contubernium", century)
                );

                troop.soldiers.add(century.officer);
            }
        }

        if (troopType.equalsIgnoreCase("Legion")) {
            
            for (Troop cohort: troop.troops) {

                troop.soldiers.addAll(
                    getAllSoldiers("Contubernium", cohort)
                );

                troop.soldiers.add(cohort.officer);
            }
        }

        return troop.soldiers;
    }

    public static String summary(Troop troop) {

        String summary = "\n::: " + troop.type.toUpperCase() + " summary :::\n";

        summary += "Leader: " + troop.officer + "\n";
        summary += "Soldiers count: " + troop.soldiers.size() + "\n";
        summary += "Troops count: " + troop.troops.size() + "\n";
        summary += "::::::::::::\n";

        return summary;
    }

    public static String fullSummary(Troop troop) {

        String fullSummary = summary(troop);
        int troopsCount = troop.troops.size();

        for (int i = 0; i < troopsCount; i++)
            fullSummary += summary(troop.troops.get(i));

        return fullSummary;
    }
}