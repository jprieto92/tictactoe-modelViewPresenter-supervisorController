package jprieto.tictactoe.views;

import jprieto.tictactoe.types.Coordinate;
import jprieto.tictactoe.types.Error;
import jprieto.utils.models.ConcreteCoordinate;
import jprieto.utils.models.SquareBoundedCoordinate;
import jprieto.utils.views.SquareBoundedCoordinateView;

class CoordinateView extends SquareBoundedCoordinateView {

    @Override
    public SquareBoundedCoordinate createCoordinate(ConcreteCoordinate concreteCoordinate) {
        return new Coordinate(concreteCoordinate);
    }

    @Override
    public String getErrorMessage() {
        return ErrorView.MESSAGES[Error.WRONG_COORDINATES.ordinal()];
    }

}
