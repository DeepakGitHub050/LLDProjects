package WinningStrategies;

import Models.Board;
import Models.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);

    void undo(Board board, Move lastMove);
}