package jprieto.tictactoe.models;

import jprieto.tictactoe.types.Coordinate;
import jprieto.tictactoe.types.Error;

public class Game {

    private Board board;
    private Turn turn;

    public Game() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    public void reset() {
        this.board.reset();
        this.turn.reset();
    }

    public void next() {
        this.turn.next();
    }

    public Player getActivePlayer() {
        return this.turn.getActivePlayer();
    }

    public Board getBoard() {
        return this.board;
    }

    public boolean isTicTacToe() {
        return this.board.isTicTacToe(this.turn.getActiveColor());
    }

    public boolean areAllTokensOnBoard() {
        return this.turn.areAllTokensOnBoard();
    }

    public void putToken(Coordinate coordinate) {
        this.turn.putToken(coordinate);
    }

    public Error getPutTokenError(Coordinate coordinate) {
        return this.turn.getPutTokenError(coordinate);
    }

    public void moveToken(Coordinate origin, Coordinate target) {
        this.turn.moveToken(origin, target);
    }

    public Error getOriginMoveTokenError(Coordinate coordinate) {
        return this.turn.getOriginMoveTokenError(coordinate);
    }

    public Error getTargetMoveTokenError(Coordinate origin, Coordinate target) {
        return this.turn.getTargetMoveTokenError(origin, target);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (board == null) {
            if (other.board != null)
                return false;
        } else if (!board.equals(other.board))
            return false;
        if (turn == null) {
            return other.turn == null;
        } else return turn.equals(other.turn);
    }

}
