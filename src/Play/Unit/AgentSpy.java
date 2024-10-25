package Play.Unit;

import Play.Base.BandUnit;

public class AgentSpy extends BandUnit {
    private int extrapointsattack;

    public AgentSpy(int hitpoints) {
        super(hitpoints);
    }

    public int getExtrapointsattack() {
        return extrapointsattack;
    }

    public int Rest() {

    }
}
