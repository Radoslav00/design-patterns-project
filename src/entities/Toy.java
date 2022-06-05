package entities;

public abstract class Toy {

    public String getId(){
       return this.getClass().getSimpleName();
    };
}
