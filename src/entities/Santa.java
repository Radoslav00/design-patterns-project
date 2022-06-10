package entities;

import command.Command;

import java.util.ArrayList;
import java.util.List;

public class Santa {
    private static Santa instance;
    private List<Toy> toyList;

    private Santa(){
        this.toyList = new ArrayList<>();
    }

    public static Santa getInstance() {
        if (instance == null) {
            instance = new Santa();
        }
        return instance;
    }


    public void sayWords(Command command) {
        command.execute();
    }

    public void addToy(Toy toy){
        this.toyList.add(toy);
    }

    public void seeToys(){
        System.out.println("There are " + this.toyList.size() + " toys in Santa's bag");
        for (Toy toy:this.toyList) {
            System.out.println(toy.toString());
        }
    }
}
