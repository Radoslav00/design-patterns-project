package factories;

import entities.Bike;
import entities.Doll;
import factories.AbstractFactory;

public class BikeFactory extends AbstractFactory<Bike> {
    private static BikeFactory instance;

    private BikeFactory() {}

    public static BikeFactory getInstance() {
        if (instance == null) {
            instance = new BikeFactory();
        }
        return instance;
    }

    @Override
    public Bike getToy(String[] args) {
        return new Bike(args[0]);
    }

}
