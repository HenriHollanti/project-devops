package tictactoe;

public interface Logic {
    /**
     * A method for checking the game's winner.
     */
    void checkWinner();
    /**
     * A method for resetting the board or the
     * game's state.
     */
    void resetBoard();
}