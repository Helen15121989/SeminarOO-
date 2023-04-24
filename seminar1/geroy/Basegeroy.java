package seminar1.geroy;
/*
 * Создание полей данных для персонажей
 */

public abstract class Basegeroy implements GameInterface {

    protected String name;
    protected String entity;
    protected int level;
    protected int health, damage, speed, weapon;

    Basegeroy(String name, String entity, int level, int health, int damage, int speed, int weapon) {
        this.name = name;
        this.entity = entity;
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.weapon = weapon;

    }

  
    @Override
    public String getInfo() {
        return entity +"-"+ name + "," + " уровень:" + level + "; здоровье:" + health + "; урон:" + damage + "; скорость:" + speed
                + "; оружие:" + weapon;
    }

    @Override
    public void step() {

    }

}
