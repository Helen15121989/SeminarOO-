package seminar1.geroy;
/*
 * Монах
 */

public class Monk extends Magic {
    public Monk(String name) {
        super(name, "Монах", 9, 99, 10, 3, 2, 35);

    }

    @Override
    public String toString() {
        return "Монах";
    }

    public String getInfo() {
        return entity +"-"+ name + "," + " уровень:" + level + "; здоровье:" + health + "; урон:" + damage + "; скорость:"
                + speed
                + "; оружие:" + weapon + "; мана:" + mana;

    }

    @Override
    public void step() {

    }
}
