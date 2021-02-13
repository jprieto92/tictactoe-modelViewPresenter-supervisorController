package jprieto.tictactoe.models;

import jprieto.tictactoe.types.Color;
import jprieto.tictactoe.types.Coordinate;
import jprieto.tictactoe.types.Error;

public class Player {

    private Color color;
    private Board board;
    private int putTokens;

    Player(Color color, Board board) {
        assert !color.isNull();
        assert board != null;

        this.color = color;
        this.board = board;
        this.putTokens = 0;
    }

<<<<<<< HEAD
    boolean areAllTokensOnBoard() {
=======
    public boolean areAllTokensOnBoard() {
>>>>>>> First draft with MVP supervisor controller implemented
        return this.putTokens == Coordinate.DIMENSION;
    }

    void putToken(Coordinate coordinate) {
        assert this.putTokens < Coordinate.DIMENSION;

        this.board.putToken(coordinate, this.color);
        this.putTokens++;
    }

    Error getPutTokenError(Coordinate coordinate) {
        if (!this.board.isEmpty(coordinate)) {
            return Error.NOT_EMPTY;
        }
        return Error.NULL;
    }

    void moveToken(Coordinate origin, Coordinate target) {
        this.board.moveToken(origin, target);
    }

    Error getOriginMoveTokenError(Coordinate origin) {
        if (!this.board.isOccupied(origin, this.color)) {
            return Error.NOT_OWNER;
        }
        return Error.NULL;
    }

    Error getTargetMoveTokenError(Coordinate origin, Coordinate target) {
        if (origin.equals(target)) {
            return Error.SAME_COORDINATES;
        }
        if (!this.board.isEmpty(target)) {
            return Error.NOT_EMPTY;
        }
        return Error.NULL;
    }

    public Color getColor() {
        return this.color;
    }
    
}
