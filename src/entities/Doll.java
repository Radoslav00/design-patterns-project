package entities;

public class Doll extends Toy {
    String gender;

    public Doll(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Doll is " + this.gender;
    }
}
