import command.INeedBike;
import command.INeedDoll;
import entities.Board;
import entities.Elves;
import entities.Santa;

public class Workshop {
    Board board;

    public Workshop() {
        this.board = new Board();
        Elves elve1 = new Elves("elf1");

        board.subscribe(elve1);
    }

    public static void main(String[] args) {
        Workshop workshop = new Workshop();
        Santa santa = Santa.getInstance();


        santa.sayWords(new INeedBike(workshop.board));
        santa.sayWords(new INeedDoll(workshop.board));
        santa.sayWords(new INeedDoll(workshop.board));

        santa.seeToys();
    }
}
