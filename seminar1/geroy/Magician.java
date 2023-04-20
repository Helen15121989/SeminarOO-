package seminar1.geroy;
/*
 * Колдун
 */

public class Magician extends Magic {
    public Magician (String name){
        super(name, 5, 90, 5,4,6,50);

    }
    
    @Override
    public String toString() {
        return name;
    }
    public String getInfo() {
        return String.format("Колдун: %s",
                this.name);
    }

    
}
