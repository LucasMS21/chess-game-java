package chesslayer.pieces;

import boardgame.Board;
import chesslayer.ChessPiece;
import chesslayer.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
