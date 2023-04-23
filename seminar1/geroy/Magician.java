package seminar1.geroy;
/*
 * Колдун
 */

public class Magician extends Magic {
    public Magician(String name) {
        super(name, 5, 90, 5, 4, 6, 50);

    }

    @Override
    public String toString() {
        return "Колдун";
    }

    public String getInfo() {
        return name + "," + " уровень:" + level + "; здоровье:" + health + "; урон:" + damage + "; скорость:" + speed
                + "; оружие:" + weapon + "; мана:" + mana;
    }

    public void step() {

    }

}
