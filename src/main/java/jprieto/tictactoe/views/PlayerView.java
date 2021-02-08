package jprieto.tictactoe.views;

import jprieto.tictactoe.models.Player;
import jprieto.tictactoe.views.Message;

public class PlayerView {

    private Player player;

    PlayerView(Player player) {
        this.player = player;
    }

    public void writeWinner() {
        new MessageView().writeln(Message.PLAYER_WIN, this.player.getColor().name());
    }

}
