package jprieto.tictactoe.controllers;

import jprieto.tictactoe.models.Game;
import jprieto.tictactoe.views.ViewFactory;

public class StartController extends Controller {

    public StartController(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    public void control() {
        this.viewFactory.createStartView().write();
        this.viewFactory.createBoardView(this.game.getBoard()).write();
    }

}
