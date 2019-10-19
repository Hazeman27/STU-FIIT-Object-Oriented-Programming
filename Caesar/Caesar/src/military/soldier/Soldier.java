package military.soldier;

public abstract class Soldier {

    private Status morale = new Status(50);
    private Status energy = new Status(50);
    private Status satiety = new Status(50);
    private Status hygiene = new Status(50);
    private Status health = new Status();

    public final int getMorale() {
        return this.morale.get();
    }

    public final int getEnergy() {
        return this.energy.get();
    }

    public final int getSatiety() {
        return this.satiety.get();
    }

    public final int getHygiene() {
        return this.hygiene.get();
    }

    public final int getHealth() {
        return this.health.get();
    }

    public final void setMorale(int value) {
        this.morale.set(value);
    }

    public final void setEnergy(int value) {
        this.energy.set(value);
    }

    public final void setSatiety(int value) {
        this.satiety.set(value);
    }

    public final void setHygiene(int value) {
        this.hygiene.set(value);
    }

    public final void setHealth(int value) {
        this.health.set(value);
    }

    public void flee() {

    }

    public void die() {

    }

    public void eat() {

    }

    public void getSick() {

    }

    public void heal() {

    }

	public boolean attack() {
        return false;
    };

	public boolean block() {
        return false;
    };

	public boolean recieveOrder() {
        return false;
    };

	public boolean acceptOrder() {
        return false;
    };

    public boolean rejectOrder() {
        return false;
    };
}
