package jprieto.tictactoe;

import jprieto.tictactoe.models.Game;
import jprieto.tictactoe.views.View;

class TicTacToe {

	private Game game;
	private View view;

	TicTacToe() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}

}