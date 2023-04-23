package seminar1.geroy;

/*
 * Крестьянин
 */
public class Peasant extends Basegeroy  {
    public Peasant(String name) {
        super(name, 2, 100, 2, 5, 5);

    }

    @Override
    public String toString() {
        return "Крестьянин";

    }

    public String getInfo() {
        return name + "," + " уровень:" + level + "; здоровье:" + health + "; урон:" + damage + "; скорость:" + speed
                + "; оружие:" + weapon;
    }

    @Override
    public void step() {

    }

}
