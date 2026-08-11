package boardgame;

import chesslayer.ChessPiece;

import java.util.Arrays;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();


    public boolean possibleMove(Position position) {
        int row = position.getRow();
        int column = position.getColumn();
        boolean matAux[][] = possibleMoves();

        return matAux[row][column];
    }


    public boolean isThereAnyPossibleMove() {
        boolean matAux[][] = possibleMoves();
        for (int i = 0; i < matAux.length; i++) {
            for (int j = 0; j < matAux.length; j++) {
                if(matAux[i][j] == true){
                    return true;
                }
            }
        }
        return false;

    }


}
