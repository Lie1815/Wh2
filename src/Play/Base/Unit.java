package Play.Base;

 abstract  public class Unit {
private int hitpoints;

    public int getHitpoints() {
        return hitpoints;
    }
    public Unit (int hitpoints){
        this.hitpoints = hitpoints;
    }

    public String toString() {
        return "Unit{" +
                "hitpoints=" + hitpoints +
                '}';
    }
    public boolean isAlive() {
        return hitpoints > 0;
    }

    public int Rest() {

    }



}
