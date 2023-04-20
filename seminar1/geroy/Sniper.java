package seminar1.geroy;
/*
 * Снайпер
 */

public class Sniper extends Shooter {
    public Sniper(String name) {
        super(name, 9, 88, 5, 5, 10, 15, 5, 15, 0.9f);
    }

    @Override
    public String toString() {
        return name;
    }
    public String getInfo() {
        return String.format("Снайпер: %s",
                this.name);
    }

}
