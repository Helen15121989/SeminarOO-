package seminar1.geroy;
/*
 * Создание полей данных для персонажей
 */

public class Basegeroy {
    protected String name;
    protected int level;
    protected int health, damage, speed,weapon;

    Basegeroy(String name, int level, int health, int damage, int speed, int weapon) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.weapon = weapon;

    }

    void attack() {

    }

    void protection() {

    }

    void damage() {

    }

    void expectation() {

    }

}