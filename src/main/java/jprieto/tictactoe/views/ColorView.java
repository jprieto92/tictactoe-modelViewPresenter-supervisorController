package jprieto.tictactoe.views;

import jprieto.tictactoe.types.Color;
import jprieto.utils.views.Console;

public class ColorView {

    public void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
    
}
