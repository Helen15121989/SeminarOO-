package seminar1.geroy;

import java.util.ArrayList;

public abstract class Shooter extends Basegeroy {
    protected int distance, maxshot, numberShotsFired;
    protected float accuracy;

    Shooter(int initiative, ArrayList<Basegeroy> team, String name, String intity, int level, int health, int maxHp, int [] damage,
            int speed, int weapon,
            int distance, int maxshot, int numberShotsFired, float accuracy) {
        super(initiative, team, name, intity, level, health, maxHp, damage, speed, weapon);
        this.distance = distance;
        this.maxshot = maxshot;
        this.numberShotsFired = numberShotsFired;
        this.accuracy = accuracy;

    }

    void shoot() {
    }

}
