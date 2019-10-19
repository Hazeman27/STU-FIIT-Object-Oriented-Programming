package military.romans.troops;

import military.romans.officers.Legate;
import military.troop.Troop;

public class Legion implements Troop {

    private final int cohortsMaxAmount = 10;
    private Cohort[] cohorts = new Cohort[this.cohortsMaxAmount];
    private Legate legate;

    public Legion(Cohort[] cohorts, Legate legate) {

        this.initCohorts(cohorts);
        this.legate = legate;
    }
    
    public Legion(Cohort[] cohorts) {
        
        this.initCohorts(cohorts);
        this.legate = new Legate();
    }

    public Legion() {
        
        this.initCohorts(null);
        this.legate = new Legate();
    }

    public void initCohorts(Cohort[] cohorts) {

        if (cohorts == null) 
            for (int i = 0; i < this.cohortsMaxAmount; i++)
                this.cohorts[i] = new Cohort(!(i != 0));

        else
            for (int i = 0; i < this.cohortsMaxAmount; i++)
                this.cohorts[i] = cohorts[i];
    }

    public void printSymbol() {
        System.out.println("[><]");
    }

    public Cohort[] getCohorts() {
        return this.cohorts;
    }

    public Cohort getFirstCohort() {
        return this.cohorts[0];
    }

    public Legate getLegate() {
        return this.legate;
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