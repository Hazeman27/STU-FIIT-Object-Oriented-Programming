package military.romans.troops;

import military.romans.officers.Centurion;
import military.romans.troops.Contubernium;
import military.troop.Troop;

public class Century implements Troop {

    private int contuberniumsMaxAmount = 10;
    private boolean isInFirstCohort = false;
    private Contubernium[] contuberniums;
    private Centurion centurion;
    
    public Century(boolean isInFirstCohort, Contubernium[] contuberniums, Centurion centurion) {

        this.initContuberniums(isInFirstCohort);
        this.fillContuberniums(isInFirstCohort, contuberniums);

        this.centurion = centurion;
    }
    
    public Century(boolean isInFirstCohort, Contubernium[] contuberniums) {
        
        this.initContuberniums(isInFirstCohort);
        this.fillContuberniums(isInFirstCohort, contuberniums);

        this.centurion = new Centurion();
    }

    public Century(boolean isInFirstCohort) {
        
        this.initContuberniums(isInFirstCohort);
        this.fillContuberniums(isInFirstCohort, null);

        this.centurion = new Centurion();
    }

    public Century() {
        
        this.initContuberniums(false);
        this.fillContuberniums(false, null);

        this.centurion = new Centurion();
    }

    public void initContuberniums(boolean isInFirstCohort) {

        if (isInFirstCohort) {
            
            this.isInFirstCohort = true;
            this.contuberniumsMaxAmount = 20;
        }

        this.contuberniums = new Contubernium[this.contuberniumsMaxAmount];
    }

    public void fillContuberniums(boolean inFirstCohort, Contubernium[] contuberniums) {

        if (contuberniums == null) 
            for (int i = 0; i < this.contuberniumsMaxAmount; i++)
                this.contuberniums[i] = new Contubernium();

        else
            for (int i = 0; i < this.contuberniumsMaxAmount; i++)
                this.contuberniums[i] = contuberniums[i];
    }

    public Contubernium[] getContuberniums() {
        return this.contuberniums;
    }

    public Centurion getCenturion() {
        return this.centurion;
    }

    public boolean isInFirstCohort() {
        return this.isInFirstCohort;
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