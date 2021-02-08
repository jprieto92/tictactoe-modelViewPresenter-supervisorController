package jprieto.tictactoe.controllers;

import jprieto.tictactoe.models.Game;
<<<<<<< HEAD
=======
import jprieto.tictactoe.models.MachinePlayer;
import jprieto.tictactoe.models.UserPlayer;
>>>>>>> First draft with MVP supervisor controller implemented
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
<<<<<<< HEAD
            if (!this.game.areAllTokensOnBoard()) {
=======
            if (!this.game.getActivePlayer().areAllTokensOnBoard()) {
>>>>>>> First draft with MVP supervisor controller implemented
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
<<<<<<< HEAD
            coordinate = this.getCoordinate(Message.ENTER_COORDINATE_TO_PUT);
=======
            coordinate = this.getCoordinate(this.game.getActivePlayer(), Message.ENTER_COORDINATE_TO_PUT);
>>>>>>> First draft with MVP supervisor controller implemented
            error = this.getPutTokenError(coordinate);
        } while (!error.isNull());
        this.game.putToken(coordinate);
    }

<<<<<<< HEAD
    private Coordinate getCoordinate(Message message) {
        assert message != null;
=======
    private Coordinate getCoordinate(UserPlayer player, Message message) {
        assert message != null; 
>>>>>>> First draft with MVP supervisor controller implemented

        return (Coordinate) this.viewFactory.createCoordinateView().read(message.toString());
    }

<<<<<<< HEAD
=======
    private Coordinate getCoordinate(MachinePlayer player, Message message) {
        assert message != null;
        
        return (Coordinate) ((MachinePlayer)player).getRandomCoordinate();
    }
    
>>>>>>> First draft with MVP supervisor controller implemented
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
<<<<<<< HEAD
            origin = this.getCoordinate(Message.COORDINATE_TO_REMOVE);
=======
            origin = this.getCoordinate(this.game.getActivePlayer(), Message.COORDINATE_TO_REMOVE);
>>>>>>> First draft with MVP supervisor controller implemented
            error = this.getOriginMoveTokenError(origin);
        } while (error != Error.NULL);
        Coordinate target;
        do {
<<<<<<< HEAD
            target = this.getCoordinate(Message.COORDINATE_TO_MOVE);
=======
            target = this.getCoordinate(this.game.getActivePlayer(), Message.COORDINATE_TO_MOVE);
>>>>>>> First draft with MVP supervisor controller implemented
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
