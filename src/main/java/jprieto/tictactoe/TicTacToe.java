package jprieto.tictactoe;

import jprieto.tictactoe.controllers.PlayController;
import jprieto.tictactoe.controllers.ResumeController;
import jprieto.tictactoe.controllers.StartController;
import jprieto.tictactoe.models.Game;
import jprieto.tictactoe.views.ViewFactory;

class TicTacToe {

	 private Game game;
	 private ViewFactory viewFactory;
	 private StartController startController;
	 private PlayController playController;
	 private ResumeController resumeController;


	TicTacToe() {
		this.game = new Game();
        this.viewFactory = this.createViewFactory();
        this.startController = new StartController(this.game, this.viewFactory);
        this.playController = new PlayController(this.game, this.viewFactory);
        this.resumeController = new ResumeController(this.game, this.viewFactory);
	}
	
	private ViewFactory createViewFactory() {
        return new ViewFactory();
    }

	private void play() {
		do {
            this.startController.control();
            this.playController.control();
        } while (this.resumeController.control());
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}

}