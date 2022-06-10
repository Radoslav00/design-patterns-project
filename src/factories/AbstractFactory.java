package factories;

import entities.Bike;
import entities.Doll;

public abstract class AbstractFactory<Toy> {

    public abstract Toy getToy(String[] args);

}
