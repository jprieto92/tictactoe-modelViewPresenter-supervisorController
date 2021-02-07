package jprieto.tictactoe.views;

import jprieto.tictactoe.types.Error;
import jprieto.utils.views.Console;

class ErrorView {

	static final String[] MESSAGES = {
			"The square is not empty",
			"There is not a token of yours",
			"The origin and target squares are the same",
			"The coordinates are wrong"
	};
	
	void writeln(Error error) {
		if (!error.isNull()){
			Console.getInstance().writeln(ErrorView.MESSAGES[error.ordinal()]);
		}
	}

}
