package jprieto.utils.views;

import jprieto.utils.models.ConcreteCoordinate;
import jprieto.utils.models.SquareBoundedCoordinate;

public abstract class SquareBoundedCoordinateView {

    public SquareBoundedCoordinate read(String message) {
        assert message != null;

        boolean error;
        SquareBoundedCoordinate squareBoundedCoordinate;
        do {
            ConcreteCoordinate concreteCoordinate = new ConcreteCoordinateView().read(message);
            squareBoundedCoordinate = this.createCoordinate(concreteCoordinate);

            error = !squareBoundedCoordinate.isValid();
            if (error) {
                Console.getInstance().writeln(this.getErrorMessage());
            }
        } while (error);
        return squareBoundedCoordinate;
    }

    public abstract SquareBoundedCoordinate createCoordinate(ConcreteCoordinate concreteCoordinate);

    public abstract String getErrorMessage();

}
