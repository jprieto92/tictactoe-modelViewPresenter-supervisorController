package jprieto.tictactoe.controllers;

import jprieto.tictactoe.models.Game;
import jprieto.tictactoe.views.ViewFactory;

public abstract class Controller {

    protected Game game;
    protected ViewFactory viewFactory;

    Controller(Game game, ViewFactory viewFactory) {
        this.game = game;
        this.viewFactory = viewFactory;
    }

}
