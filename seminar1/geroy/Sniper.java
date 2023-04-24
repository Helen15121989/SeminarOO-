package seminar1.geroy;
/*
 * Снайпер
 */

public class Sniper extends Shooter {
    public Sniper(String name) {
        super(name, "Снайпер", 9, 88, 5, 5, 10, 15, 5, 15, 0.9f);
    }

    @Override
    public String toString() {
        return "Снайпер";
    }

    public String getInfo() {
        return entity +"-"+  name + "," + " уровень:" + level + "; здоровье:" + health + "; урон:" + damage + "; скорость:" + speed
                + "; оружие:" + weapon + "; дистанция:" + distance +
                "; максимальный выстрел:" + maxshot + "; кол-во выстрелов:" + numberShotsFired + "; точность:"
                + accuracy;
    }

    @Override
    public void step() {

    }

}
