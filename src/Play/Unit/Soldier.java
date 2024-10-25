package Play.Unit;

import Play.Base.BandUnit;

public class Soldier extends BandUnit {
    private int extrapointhp;


    public Soldier(int hitpoints) {
        super(hitpoints);
    }

    public boolean isAlive() {
        return extrapointhp > 0;
    }

    public int Rest() {

    }
}

