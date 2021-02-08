package jprieto.tictactoe.views;

import jprieto.tictactoe.models.Board;
import jprieto.tictactoe.types.Coordinate;
import jprieto.tictactoe.views.Message;
import jprieto.utils.views.Console;

public class BoardView {

    private Board board;

    BoardView(Board board) {
        this.board = board;
    }

    public void write() {
        new MessageView().writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Coordinate.DIMENSION; i++) {
            new MessageView().write(Message.VERTICAL_LINE);
            for (int j = 0; j < Coordinate.DIMENSION; j++) {
                new ColorView().write(this.board.getColor(new Coordinate(i, j)));
                new MessageView().write(Message.VERTICAL_LINE);
            }
            Console.getInstance().writeln();
        }
        new MessageView().writeln(Message.HORIZONTAL_LINE);
    }

}
