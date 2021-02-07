package jprieto.tictactoe.views;

import jprieto.tictactoe.models.MachinePlayer;
import jprieto.tictactoe.types.Coordinate;

class MachinePlayerView extends PlayerView {

    MachinePlayerView(MachinePlayer machinePlayer) {
        super(machinePlayer);
    }

    @Override
    protected Coordinate getCoordinate(Message message) {
        return ((MachinePlayer) this.player).getRandomCoordinate();
    }
    
}
