package jprieto.tictactoe.models;

import jprieto.tictactoe.types.Color;
import jprieto.tictactoe.types.Coordinate;
import jprieto.tictactoe.types.Error;

public class Turn {

    private Board board;
    public static final int NUMBER_PLAYERS = 2;
    private Player[] players;
    private int activePlayer;

    Turn(Board board) {
        assert board != null;
        this.board = board;
        this.players = new Player[Turn.NUMBER_PLAYERS];
        this.reset();
    }

    void reset() {
        for (int i = 0; i < Turn.NUMBER_PLAYERS; i++) {
            this.players[i] = new Player(Color.get(i), this.board);
        }
        this.activePlayer = 0;
    }

    void next() {
        if (!this.board.isTicTacToe(this.getActiveColor())) {
            this.activePlayer = (this.activePlayer + 1) % Turn.NUMBER_PLAYERS;
        }
    }

    Player getActivePlayer() {
        return this.players[this.activePlayer];
    }

    Color getActiveColor() {
        return this.getActivePlayer().getColor();
    }
    
    void putToken(Coordinate coordinate) {
        this.getActivePlayer().putToken(coordinate);
    }
    
    void moveToken(Coordinate origin, Coordinate target) {
        this.getActivePlayer().moveToken(origin, target);
    }
    
    Error getPutTokenError(Coordinate coordinate) {
        return this.getActivePlayer().getPutTokenError(coordinate);
    }
    
    Error getOriginMoveTokenError(Coordinate coordinate) {
        return this.getActivePlayer().getOriginMoveTokenError(coordinate);
    }

    Error getTargetMoveTokenError(Coordinate origin, Coordinate target) {
        return this.getActivePlayer().getTargetMoveTokenError(origin, target);
    }

    boolean areAllTokensOnBoard() {
        return this.getActivePlayer().areAllTokensOnBoard();
    }

    void putToken(Coordinate coordinate) {
        this.getActivePlayer().putToken(coordinate);
    }

    Error getPutTokenError(Coordinate coordinate) {
        return this.getActivePlayer().getPutTokenError(coordinate);
    }

    void moveToken(Coordinate origin, Coordinate target) {
        this.getActivePlayer().moveToken(origin, target);
    }

    Error getOriginMoveTokenError(Coordinate coordinate) {
        return this.getActivePlayer().getOriginMoveTokenError(coordinate);
    }

    Error getTargetMoveTokenError(Coordinate origin, Coordinate target) {
        return this.getActivePlayer().getTargetMoveTokenError(origin, target);
    }

}
