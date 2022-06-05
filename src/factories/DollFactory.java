package factories;

import entities.Bike;
import entities.Doll;

public class DollFactory extends AbstractFactory<Doll>{
    private static DollFactory instance;

    public static DollFactory getInstance(){
        if(instance == null){
            instance = new DollFactory();
        }
        return instance;
    }

    @Override
    public Doll getToy(String[] args) {
        return new Doll(args[0]);
    }




   /* @Override
    public Bike getBike(String bikeColor) {
        //doll factory cannot return bike
        return null;
    }

    @Override
    public Doll getDoll(String dollGender) {
        if(dollGender.equals("MALE")){
            return new Doll("male");
        }
        else if(dollGender.equals("FEMALE")){
            return new Doll("female");
        }
        else{
            return new Doll("unknown");
        }
    }*/
}
