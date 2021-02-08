package jprieto.tictactoe.views;

import jprieto.tictactoe.models.Board;
import jprieto.tictactoe.models.Player;
import jprieto.tictactoe.views.ViewFactory;

public class ViewFactory {

    public BoardView createBoardView(Board board) {
        return new BoardView(board);
    }

    public CoordinateView createCoordinateView() {
        return new CoordinateView();
    }

    public PlayerView createPlayerView(Player player) {
        return new PlayerView(player);
    }

    public ResumeView createResumeView() {
        return new ResumeView();
    }

    public StartView createStartView() {
        return new StartView();
    }

    public ErrorView createErrorView() {
        return new ErrorView();
    }

}
