package military.romans.troops;

import military.romans.officers.Legate;
import military.troop.Troop;

import java.util.ArrayList;

public class Legion extends Troop {

    private int number;

    public Legion(ArrayList<Troop> cohorts, Legate legate, int number) {

        super("Legion", cohorts, legate, 9);

        this.addFirstCohort();
        this.number = number;
    }

    public Legion(ArrayList<Troop> cohorts, int number) {

        super("Legion", cohorts, 9);

        this.addFirstCohort();
        this.number = number;
    }

    public Legion(int number) {
        
        super("Legion", null, 9);

        this.addFirstCohort();
        this.number = number;
    }

    public Legion() {
        
        super("Legion", null, 9);

        this.addFirstCohort();
        this.number = 0;
    }

    private void addFirstCohort() {

        CohortFirst cohortFirst = new CohortFirst();
        this.troops.add(cohortFirst);

        this.soldiers.addAll(cohortFirst.getSoldiers());
        this.soldiers.add(cohortFirst.getOfficer());
    }

    public void printSymbol() {
        System.out.println("[><]");
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}