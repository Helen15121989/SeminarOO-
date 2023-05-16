package seminar1.geroy;

import java.util.ArrayList;

/*
 * Разбойник
 */
public class Outlaw extends Basegeroy {
    protected int luck, armor;

    Outlaw(int initiative,  ArrayList<Basegeroy> team,String name, String entity, int level, int health,int maxHp, int [] damage, int speed, int weapon, int luck, int armor) {
        super(initiative,team, name, entity, level, health, maxHp, damage, speed, weapon);
        this.luck = luck;
        this.armor = armor;

    }

    public Outlaw(ArrayList<Basegeroy> team,String name) {
        super(2,team, name, "Разбойник", 4, 95,100, new int []{5,4}, 5, 3);
    }

    void disappearance() {

    }

    void armorProtection() {

    }

    @Override
    public String toString() {
        return "Разбойник";
    }

    public String getInfo() {
        return entity +"-"+ name + "," + " уровень:" + level + "; здоровье:" + health + "; скорость:" + speed
                + "; оружие:" + weapon + "; удача:" + luck + "; броня:" + armor+ "; инициатива: " + initiative;
    }

    @Override
    public void step() {

    }

}
