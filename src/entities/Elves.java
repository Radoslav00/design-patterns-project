package entities;

import factories.BikeFactory;
import factories.DollFactory;
import observer.Observable;
import observer.Observer;

public class Elves implements Observer {
    public String name;
    private Observable board;

    public Elves(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Toy item = null;

        if (this.board == null) {
            System.out.println("no board set");
            return;
        }
        String toy = this.board.getToyNeeded();
        if(toy.equals("BIKE")){
            item = BikeFactory.getInstance().getToy(new String[]{"blue"});
        }
        else if(toy.equals("DOLL")){
            item = DollFactory.getInstance().getToy(new String[]{"male"});
        }
        if(item !=null){
            Santa.getInstance().addToy(item);
        }
    }

    @Override
    public void setBoard(Observable board) {
        this.board = board;
    }
}
