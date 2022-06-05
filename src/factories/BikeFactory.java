package factories;

import entities.Bike;
import entities.Doll;
import factories.AbstractFactory;

public class BikeFactory extends AbstractFactory<Bike> {
    private static BikeFactory instance;

    public static BikeFactory getInstance(){
        if(instance == null){
            instance = new BikeFactory();
        }
        return instance;
    }

    @Override
    public Bike getToy(String[] args) {
        return new Bike(args[0]);
    }
/*
    @Override
    public Bike getBike(String bikeColor) {
        if(bikeColor.equals("RED")){
            return new Bike("red");
        }
        else if(bikeColor.equals("BLUE")){
            return new Bike("blue");
        }
        else if(bikeColor.equals("GREEN")){
            return new Bike("green");
        }
        else {
            return new Bike("unknown");
        }
    }

    @Override
    public Doll getDoll(String dollGender) {
        //bike factory cannot return doll
        return null;
    }*/
}
