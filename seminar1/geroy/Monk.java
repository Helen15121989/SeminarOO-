package seminar1.geroy;
/*
 * Монах
 */

import java.util.ArrayList;

public class Monk extends Magic {
    public Monk(ArrayList<Basegeroy> team, String name) {
        super(3,team, name, "Монах", 5, 90, 100, new int[] { 4, 3 }, 9, 6, 0, 25);

    }

    @Override
    public String toString() {
        return "Монах";
    }

    public String getInfo() {
        return entity + "-" + name + "," + " уровень:" + level + "; здоровье:" + health + "; скорость:" + speed
                + "; оружие:" + weapon + "; мана:" + mana + "; инициатива: " + initiative;

    }

}
