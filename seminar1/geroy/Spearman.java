package seminar1.geroy;
/*
 * Копейщик
 */


 public class Spearman extends Shooter {
    public Spearman (String name) {
        super(name, 15, 77, 3, 1, 2, 5, 2, 10, 0.3f);
    }

    @Override
    public String toString() {
        return name;
    }
    public String getInfo() {
        return String.format("Копейщик: %s",
                this.name);
    }
}
