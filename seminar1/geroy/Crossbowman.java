package seminar1.geroy;
/*
 * Арбалетчик
 */

public class Crossbowman extends Shooter {
    public Crossbowman(String name) {
        super(name, 10, 90, 10, 2, 5, 5, 10, 10, 0.5f);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getInfo() {
        return String.format("Арбалетчик: %s",
                this.name);
    }

}
