package command;

import entities.Board;

public class INeedDoll implements Command{
    private Board board;

    public INeedDoll(Board board) {
        this.board = board;
    }

    @Override
    public void execute() {
        this.board.getToy("DOLL");
    }
}
