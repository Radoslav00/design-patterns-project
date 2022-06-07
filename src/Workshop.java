import command.INeedBike;
import command.INeedDoll;
import entities.Board;
import entities.Dwarf;
import entities.Santa;

public class Workshop {
    Board board;

    public Workshop() {
        this.board = new Board();
        Dwarf dwarf1 = new Dwarf("djudje1");

        board.subscribe(dwarf1);
    }

    public static void main(String[] args) {
        Workshop workshop = new Workshop();
        Santa connection = Santa.getInstance();


        connection.sayWords(new INeedBike(workshop.board));
        connection.sayWords(new INeedDoll(workshop.board));
        connection.sayWords(new INeedDoll(workshop.board));

        Santa.getInstance().seeToys();
    }
}
