package com.company;

/**Instead of sending the entire board to the client every time I also store it locally
 * The class can put a piece and print on console the local board
 */
public class LocalBoard {
    private final int boardDimension = 10;
    private int[][] boardPieces;

    /**
     * Initially the board is empty, I fill it with 0
     */
    public LocalBoard() {
        int i, j;
        boardPieces = new int[boardDimension][boardDimension];
        for (i = 0; i < boardPieces.length; i++) {
            for (j = 0; j < boardPieces[i].length; j++) {
                boardPieces[i][j] = 0;
            }
        }
    }

    /**
     * Places a piece at coordinates given by a player
     * @param player
     * @param xCoordinate
     * @param yCoordinate
     */
    public void putPiece(int player, int xCoordinate, int yCoordinate) {
        boardPieces[xCoordinate][yCoordinate] = player;
    }

    /**
     * Prints on the console the board
     */
    public void printBoard(){
        int i, j;
        for (i = 0; i < boardPieces.length; i++) {
            for (j = 0; j < boardPieces[i].length; j++) {
                System.out.print(boardPieces[i][j]-32 + ' ');
            }
            System.out.println(" ");
        }
    }
}
