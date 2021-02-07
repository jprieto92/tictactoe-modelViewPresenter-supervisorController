package jprieto.tictactoe.models;

public interface PlayerVisitor {

    void visit(UserPlayer userPlayer);
    void visit(MachinePlayer machinePlayer);

}
