package jprieto.tictactoe.models;

import jprieto.tictactoe.types.Color;
import jprieto.tictactoe.types.Coordinate;

public class MachinePlayer extends Player {

	MachinePlayer(Color color, Board board) {
		super(color, board);
	}

	public Coordinate getRandomCoordinate(){
		Coordinate coordinate = new Coordinate();
		coordinate.random();
		return coordinate;
	}

	@Override
	public void accept(PlayerVisitor playerVisitor) {
		playerVisitor.visit(this);
	}

}
