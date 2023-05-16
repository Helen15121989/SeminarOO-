package seminar1.geroy;
/*
 * Колдун
 */

import java.util.ArrayList;

public class Magician extends Magic {
    public Magician(ArrayList<Basegeroy> team, String name) {
        super(4,team, name, "Колдун", 5, 90, 100, new int[] { 2, 5 }, 9, 6, 0, 25);

    }

    @Override
    public String toString() {
        return "Колдун";
    }

    public String getInfo() {
        return entity + "-" + name + "," + " уровень:" + level + "; здоровье:" + health
                + "; скорость:" + speed
                + "; оружие:" + weapon + "; мана:" + mana + "; инициатива: " + initiative;
    }

}
