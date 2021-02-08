package jprieto.tictactoe.views;

import jprieto.tictactoe.types.Coordinate;
import jprieto.tictactoe.types.Error;
import jprieto.tictactoe.views.ErrorView;
import jprieto.utils.models.ConcreteCoordinate;
import jprieto.utils.models.SquareBoundedCoordinate;
import jprieto.utils.views.SquareBoundedCoordinateView;

public class CoordinateView extends SquareBoundedCoordinateView {

    public SquareBoundedCoordinate createCoordinate(ConcreteCoordinate concreteCoordinate) {
        return new Coordinate(concreteCoordinate);
    }

    public String getErrorMessage() {
        return ErrorView.MESSAGES[Error.WRONG_COORDINATES.ordinal()];
    }

}
