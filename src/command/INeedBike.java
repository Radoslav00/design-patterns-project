package command;

import entities.Board;

public class INeedBike implements Command {
    private final Board board;

    public INeedBike(Board board) {
        this.board = board;
    }

    @Override
    public void execute() {
        this.board.getToy("BIKE");
    }
}
