package entities;

public class Bike extends Toy {
    String color;

    public Bike(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bike in " + this.color;
    }
}
