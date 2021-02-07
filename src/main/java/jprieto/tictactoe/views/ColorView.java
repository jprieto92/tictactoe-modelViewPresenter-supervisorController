package jprieto.tictactoe.views;

import jprieto.tictactoe.types.Color;
import jprieto.utils.views.Console;

class ColorView {

    void write(Color color) {
		String string = color.name();
		if (color.isNull()) {
			string = " ";
		}
		Console.getInstance().write(string);
	}
}
