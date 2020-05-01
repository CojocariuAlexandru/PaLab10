package gameLogic;

/**
 * Creates a playing board and does operations on it to manage the logic of the game
 */
public class GameLogic {
    private Board gameBoard;
    private int winner;

    public GameLogic(){
        gameBoard = new Board();
    }

    /**
     * Manages a move - puts the piece, prints the board and finally checks for a winner
     * @param player
     * @param x
     * @param y
     */
    public void manageMove(int player, int x, int y){
        gameBoard.putPiece(player, x, y);
        gameBoard.printBoard();
        winner = gameBoard.checkForWinner();
        if(winner != 0){
            System.out.println("Good job player " + player + " you won!");
            gameBoard.resetPieces();
        }
    }

    /**
     * Get the current state of the board
     * @return
     */
    public String getBoardState(){
        String boardState;
        boardState = gameBoard.getCurrentConfiguration();
        return boardState;
    }
}
