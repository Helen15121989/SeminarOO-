package seminar1.geroy;

/*
 * Разбойник
 */
public class Outlaw extends Basegeroy {
    protected int luck, armor;

    Outlaw(String name, String entity, int level, int health, int damage, int speed, int weapon, int luck, int armor) {
        super(name, entity, level, health, damage, speed, weapon);
        this.luck = luck;
        this.armor = armor;

    }

    public Outlaw(String name) {
        super(name, "Разбойник", 4, 95, 5, 5, 3);
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
        return entity +"-"+ name + "," + " уровень:" + level + "; здоровье:" + health + "; урон:" + damage + "; скорость:"
                + speed
                + "; оружие:" + weapon + "; удача:" + luck + "; броня:" + armor;
    }

    @Override
    public void step() {

    }

}
