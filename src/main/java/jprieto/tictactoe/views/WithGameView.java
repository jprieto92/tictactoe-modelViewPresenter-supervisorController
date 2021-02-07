package jprieto.tictactoe.views;

import jprieto.tictactoe.models.Game;

abstract class WithGameView {

    protected Game game;

    WithGameView(Game game) {
        this.game = game;
    }
}
