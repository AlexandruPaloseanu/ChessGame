package TestChess.ChessGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    // E OARE NECESAR? E CAM MULT
    /*     public static void seeOccupation(Cell cell[][], Piece white[][], Piece black[][]) {

        //cell[8][8] - search for a cell
        for (int row = 0; row<8; row++) {
            for (int col = 0; col<8; col++) {

                //piece [2][8] - search for a piece
                int occupation = 0;

                innerLoop:
                for (int row2 = 0; row2<2; row2++) {
                    for (int col2 = 0; col2<8; col2++) {

                        // VERIFY IF THE SELECTED CELL IS OCCUPIED BY A PIECE

                        if ((cell[row][col].getCoordRow() == white[row2][col2].getCoordRow()) &&
                            (cell[row][col].getCoordCol() == white[row2][col2].getCoordCol())) {

                            cell[row][col].setOccupation(white[row2][col2].getName());
                            occupation = 1;
                            break innerLoop;

                        } else if ((cell[row][col].getCoordRow() == black[row2][col2].getCoordRow()) &&
                                   (cell[row][col].getCoordCol() == black[row2][col2].getCoordCol())) {

                            cell[row][col].setOccupation(black[row2][col2].getName());
                            occupation = 1;
                            break innerLoop;
                        }
                    }
                }

                if (occupation == 0) {
                    cell[row][col].setOccupation("");
                }
            }
        }
    }
*/ //-- seeOccupation()

    private static int rematch;
    private static int game;
    private static String answer;

    public static void main(String[] args) throws InputMismatchException {

        Cell cell[][] = new Cell[8][8];
        Piece white[][] = new Piece[2][8];
        Piece black[][] = new Piece[2][8];

        rematch = 0;

        // =============================================================================================================
        // =========================================== THE GAME BEGINS =================================================
        while (rematch == 0) {

            Cell.initializeCells(cell);
            Piece.initializeWhite(white);
            Piece.initializeBlack(black);
            Piece.initializePossibleMove();

            Cell.showBoard(cell);

            game = 0;

            while (game == 0) {

                Piece.setPlayerTurn("white");

                System.out.println("================================================== WHITE PLAYER'S TURN ==================================================");

                // CHECKS TO SEE IF THE WHITE KING IS IN CHECK
                Piece.checkIfCheck(white,black);


                Piece.setMoveCount(); // SETS MOVE COUNT TO -1

                Piece.move(white, black, cell);
                //neinvocand metoda move de la piesa in cauza nu putem folosi metoda specifica a lui pawn;
                // introdu-o in move; => public static void move


                // CHECKS TO SEE IF THE BLACK KING IS STILL IN THE GAME
                Piece.findKing(black);
                if (black[Piece.getKingRow()][Piece.getKingCol()].getCoordRow() == 44) {
                    System.out.println("The Black Player's king has been taken. The White Player wins.");
                    game = 1;
                }


                if (game == 0) {

                    Piece.setPlayerTurn("black");

                    System.out.println("================================================== BLACK PLAYER'S TURN ==================================================");

                    // CHECKS TO SEE IF THE BLACK KING IS IN CHECK
                    Piece.checkIfCheck(black, white);


                    Piece.setMoveCount(); // SETS MOVE COUNT TO -1

                    Piece.move(black, white, cell);

                    // CHECKS TO SEE IF THE WHITE KING IS STILL IN THE GAME
                    Piece.findKing(white);
                    if (white[Piece.getKingRow()][Piece.getKingCol()].getCoordRow() == 44) {
                        System.out.println("The White Player's king has been taken. The Black Player wins.");
                        game = 1;
                    }

                }
            }



            // =========================================================================================================
            // ======================================= THE GAME HAS ENDED ==============================================
            System.out.println("The game has ended. Do you want to: \n" +
                    "\t" + "1. Play another game, or \n" +
                    "\t" + "2. Quit. \n" +
                    "Please type in either 1 or 2 to answer.");

            Scanner answerScanner = new Scanner(System.in);
            int loopAnswer = 0;

            loopAnswer:
            while (loopAnswer == 0) {
                answer = answerScanner.nextLine();

                if (answer.equals("1")) {
                    System.out.println("You have chosen to play another game.");
                    break loopAnswer;

                } else if (answer.equals("2")) {
                    System.out.println("You have chosen to quit. Thank you for playing!");
                    rematch = 1;
                    break loopAnswer;

                } else System.out.println("You have not introduced a number correctly. Please try again.");

            }
        }
    }
}
