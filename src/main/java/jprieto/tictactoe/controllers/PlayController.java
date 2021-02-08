package jprieto.tictactoe.controllers;

import jprieto.tictactoe.models.Game;
import jprieto.tictactoe.views.Message;
import jprieto.tictactoe.views.ViewFactory;
import jprieto.tictactoe.types.Coordinate;
import jprieto.tictactoe.types.Error;

public class PlayController extends Controller {

    public PlayController(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    public void control() {
        do {
            if (!this.game.areAllTokensOnBoard()) {
                this.putToken();
            } else {
                this.moveToken();
            }
            this.game.next();
            this.viewFactory.createBoardView(this.game.getBoard()).write();
        } while (!this.game.isTicTacToe());
        this.viewFactory.createPlayerView(this.game.getActivePlayer()).writeWinner();
    }

    private void putToken() {
        Coordinate coordinate;
        Error error;
        do {
            coordinate = this.getCoordinate(Message.ENTER_COORDINATE_TO_PUT);
            error = this.getPutTokenError(coordinate);
        } while (!error.isNull());
        this.game.putToken(coordinate);
    }

    private Coordinate getCoordinate(Message message) {
        assert message != null;

        return (Coordinate) this.viewFactory.createCoordinateView().read(message.toString());
    }

    private Error getPutTokenError(Coordinate coordinate) {
        assert coordinate != null;

        Error error = this.game.getPutTokenError(coordinate);
        this.viewFactory.createErrorView().writeln(error);
        return error;
    }

    private void moveToken() {
        Coordinate origin;
        Error error;
        do {
            origin = this.getCoordinate(Message.COORDINATE_TO_REMOVE);
            error = this.getOriginMoveTokenError(origin);
        } while (error != Error.NULL);
        Coordinate target;
        do {
            target = this.getCoordinate(Message.COORDINATE_TO_MOVE);
            error = this.getTargetMoveTokenError(origin, target);
        } while (error != Error.NULL);
        this.game.moveToken(origin, target);
    }

    private Error getOriginMoveTokenError(Coordinate origin) {
        assert !origin.isNull();

        Error error = this.game.getOriginMoveTokenError(origin);
        this.viewFactory.createErrorView().writeln(error);
        return error;
    }

    private Error getTargetMoveTokenError(Coordinate origin, Coordinate target) {
        assert !origin.isNull() && !target.isNull();

        Error error = this.game.getTargetMoveTokenError(origin, target);
        this.viewFactory.createErrorView().writeln(error);
        return error;
    }

}
