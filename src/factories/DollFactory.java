package factories;

import entities.Bike;
import entities.Doll;

public class DollFactory extends AbstractFactory<Doll> {
    private static DollFactory instance;

    private DollFactory() {}


    public static DollFactory getInstance() {
        if (instance == null) {
            instance = new DollFactory();
        }
        return instance;
    }

    @Override
    public Doll getToy(String[] args) {
        return new Doll(args[0]);
    }


}
