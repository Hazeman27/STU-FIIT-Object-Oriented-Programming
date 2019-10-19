package military.romans.troops;

import military.romans.officers.Centurion;
import military.romans.troops.Century;
import military.troop.Troop;

import java.util.Random;

public class Cohort implements Troop {

    private int centuriesMaxAmount = 6;
    private boolean isFirst = false;
    private Century[] centuries;
    private Centurion leadCenturion;
    
    private Random random = new Random();
    
    public Cohort(boolean isFirst, Century[] centuries, Centurion centurion) {

        this.initCenturies(isFirst);
        this.fillCenturies(centuries);

        this.leadCenturion = centurion;
    }
    
    public Cohort(boolean isFirst, Century[] centuries) {
        
        this.initCenturies(isFirst);
        this.fillCenturies(centuries);

        this.leadCenturion = centuries[
            this.random.nextInt(this.centuriesMaxAmount)
        ].getCenturion();
    }

    public Cohort(boolean isFirst) {
        
        this.initCenturies(isFirst);
        this.fillCenturies(null);

        this.leadCenturion = centuries[
            this.random.nextInt(this.centuriesMaxAmount)
        ].getCenturion();
    }

    public Cohort() {
        
        this.initCenturies(false);
        this.fillCenturies(null);

        this.leadCenturion = centuries[
            this.random.nextInt(this.centuriesMaxAmount)
        ].getCenturion();
    }

    public void initCenturies(boolean isFirst) {

        if (isFirst) {
            
            this.isFirst = true;
            this.centuriesMaxAmount = 5;
        }

        this.centuries = new Century[this.centuriesMaxAmount];
    }

    public void fillCenturies(Century[] centuries) {

        if (centuries == null) 
            for (int i = 0; i < this.centuriesMaxAmount; i++)
                this.centuries[i] = new Century(this.isFirst);

        else
            for (int i = 0; i < this.centuriesMaxAmount; i++)
                this.centuries[i] = centuries[i];
    }

    public Century[] getCenturies() {
        return this.centuries;
    }

    public Centurion getLeadCenturion() {
        return this.leadCenturion;
    }

    public Centurion getPrimusPilus() {
        return this.isFirst ? this.leadCenturion : null;
    }

    public boolean isFirst() {
        return this.isFirst;
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