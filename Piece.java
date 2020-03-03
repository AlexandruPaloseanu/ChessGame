package TestChess.ChessGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Piece {

    // THE VARIABLES OF THE PIECES
    private int coordRow;
    private int coordCol;
    private String name;

    public String getName() {
        return name;
    }

    public int getCoordRow() {
        return coordRow;
    }

    public int getCoordCol() {
        return coordCol;
    }

    // INITIALIZATION OF THE PIECES
    public static void initializeWhite(Piece[][] white) {

        // Piece white[2][8];
        for (int col = 0; col<8; col++) {
            for (int row = 0; row<2; row++) {

                // COLUMN A
                if (col == 0) {
                    if (row == 0) {
                        white[row][col] = new Piece.Rook();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhiteRook";
                    } else {
                        white[row][col] = new Piece.Pawn();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhitePawn";
                    }
                }

                // COLUMN B
                if (col == 1) {
                    if (row == 0) {
                        white[row][col] = new Piece.Knight();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhiteKnight";
                    } else {
                        white[row][col] = new Piece.Pawn();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhitePawn";
                    }
                }

                // COLUMN C
                if (col == 2) {
                    if (row == 0) {
                        white[row][col] = new Piece.Bishop();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhiteBishop";
                    } else {
                        white[row][col] = new Piece.Pawn();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhitePawn";
                    }
                }

                // COLUMN D
                if (col == 3) {
                    if (row == 0) {
                        white[row][col] = new Piece.Queen();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhiteQueen";
                    } else {
                        white[row][col] = new Piece.Pawn();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhitePawn";
                    }
                }

                // COLUMN E
                if (col == 4) {
                    if (row == 0) {
                        white[row][col] = new Piece.King();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhiteKing";
                    } else {
                        white[row][col] = new Piece.Pawn();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhitePawn";
                    }
                }

                // COLUMN F
                if (col == 5) {
                    if (row == 0) {
                        white[row][col] = new Piece.Bishop();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhiteBishop";
                    } else {
                        white[row][col] = new Piece.Pawn();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhitePawn";
                    }
                }

                // COLUMN G
                if (col == 6) {
                    if (row == 0) {
                        white[row][col] = new Piece.Knight();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhiteKnight";
                    } else {
                        white[row][col] = new Piece.Pawn();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhitePawn";
                    }
                }

                // COLUMN H
                if (col == 7) {
                    if (row == 0) {
                        white[row][col] = new Piece.Rook();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhiteRook";
                    } else {
                        white[row][col] = new Piece.Pawn();
                        white[row][col].coordRow = 7-row;
                        white[row][col].coordCol = col;
                        white[row][col].name = "WhitePawn";
                    }
                }
            }
        }
    }

    public static void initializeBlack(Piece[][] black) {

        // Piece black[2][8];
        for (int col = 0; col<8; col++) {
            for (int row = 0; row<2; row++) {

                // COLUMN A
                if (col == 0) {
                    if (row == 0) {
                        black[row][col] = new Piece.Rook();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackRook";
                    } else {
                        black[row][col] = new Piece.Pawn();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackPawn";
                    }
                }

                // COLUMN B
                if (col == 1) {
                    if (row == 0) {
                        black[row][col] = new Piece.Knight();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackKnight";
                    } else {
                        black[row][col] = new Piece.Pawn();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackPawn";
                    }
                }

                // COLUMN C
                if (col == 2) {
                    if (row == 0) {
                        black[row][col] = new Piece.Bishop();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackBishop";
                    } else {
                        black[row][col] = new Piece.Pawn();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackPawn";
                    }
                }

                // COLUMN D
                if (col == 3) {
                    if (row == 0) {
                        black[row][col] = new Piece.Queen();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackQueen";
                    } else {
                        black[row][col] = new Piece.Pawn();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackPawn";
                    }
                }

                // COLUMN E
                if (col == 4) {
                    if (row == 0) {
                        black[row][col] = new Piece.King();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackKing";
                    } else {
                        black[row][col] = new Piece.Pawn();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackPawn";
                    }
                }

                // COLUMN F
                if (col == 5) {
                    if (row == 0) {
                        black[row][col] = new Piece.Bishop();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackBishop";
                    } else {
                        black[row][col] = new Piece.Pawn();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackPawn";
                    }
                }

                // COLUMN G
                if (col == 6) {
                    if (row == 0) {
                        black[row][col] = new Piece.Knight();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackKnight";
                    } else {
                        black[row][col] = new Piece.Pawn();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackPawn";
                    }
                }

                // COLUMN H
                if (col == 7) {
                    if (row == 0) {
                        black[row][col] = new Piece.Rook();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackRook";
                    } else {
                        black[row][col] = new Piece.Pawn();
                        black[row][col].coordRow = row;
                        black[row][col].coordCol = col;
                        black[row][col].name = "BlackPawn";
                    }
                }
            }
        }
    }
    // BY NOW, WE HAVE [2][8] WHITE PIECES AND [2][8] BLACK PIECES


    //=================================================================================================================
    //METHOD FOR SELECTING A PIECE

    private static String playerTurn = "white"; // at the beginning of the white loop - change to white; at the beginning of the black loop - change to black;

    public static void setPlayerTurn(String playerTurn) {
        Piece.playerTurn = playerTurn;
    } // poti face fara String

    // THE PLAYER'S CHOICE (A-H, 1-8 -> 0-7, 0-7)
    private static int selectionCoordRow;
    private static int selectionCoordCol;

    // THE PLAYER'S CHOICE (A-H, 1-8)
    private static int selectionVisualRow;
    private static String selectionVisualCol;

    // THE PIECE'S COORDINATES WITHIN THE ARRAY piece[row][col]
    private static int chosenPieceSearchRow;
    private static int chosenPieceSearchCol;

    public static int getChosenPieceSearchRow() {
        return chosenPieceSearchRow;
    }

    public static int getChosenPieceSearchCol() {
        return chosenPieceSearchCol;
    }
    //=================================================================================================================

    private static void selectCol (String col) {
        if (col.equals("A")) {
            selectionCoordCol = 0;
        } else if (col.equals("B")) {
            selectionCoordCol = 1;
        } else if (col.equals("C")) {
            selectionCoordCol = 2;
        } else if (col.equals("D")) {
            selectionCoordCol = 3;
        } else if (col.equals("E")) {
            selectionCoordCol = 4;
        } else if (col.equals("F")) {
            selectionCoordCol = 5;
        } else if (col.equals("G")) {
            selectionCoordCol = 6;
        } else if (col.equals("H")) {
            selectionCoordCol = 7;
        }

        if ( ((-1) < selectionCoordCol) && (selectionCoordCol < 8) ){
            selectionVisualCol = col;
        }
    }
    private static void loopSelectCol() {
        System.out.println("\n" + "Please select one of your pieces, which you would like to move or whose moves you would like to see. \n" +
                "Please begin by selecting the column of the piece by typing only the letter of the column (from A to H):");
        selectionCoordCol = (-1);
        Scanner scanner = new Scanner(System.in);
        Piece.selectCol(scanner.nextLine());

        while (selectionCoordCol == (-1)) {
            System.out.println("Something went wrong. Please try again. \n" +
                    "Please type only the letter of the column (from A to H):");
            Piece.selectCol(scanner.nextLine());
        }
    }

    private static void selectRow (int row) {

        if (0<row && row<9) {
            selectionCoordRow = 8-row;
            selectionVisualRow = row;
        }

    }
    private static int innerLoopSelectRow;
    private static void innerLoopSelectRow() {

        try {
            while (selectionCoordRow == (-1)) {

                Scanner scanner = new Scanner(System.in);
                Piece.selectRow(scanner.nextInt());

                if (selectionCoordRow != (-1)) {
                    innerLoopSelectRow = 1;
                    break;
                }

                System.out.println("The number you have introduced is out of bounds. Please try again. \n" +
                        "Please type the number of the row (from 1 to 8):");
            }

        } catch (InputMismatchException e) {
            System.out.println("Something went wrong. Please try again. \n" +
                    "Please type ONLY the number of the row (from 1 to 8):");
        }
    }
    private static void loopSelectRow () {
        System.out.println("Now, please select the row of the piece by typing the number of the row (from 1 to 8):");
        selectionCoordRow = (-1);
        innerLoopSelectRow = 0;

        while (innerLoopSelectRow == 0) {
            innerLoopSelectRow();
        }
    }

    // COLOR-SENSITIVE
    public static void selectPiece (Piece[][] piece) {

        int selection = 0;

        while (selection == 0) {

            Piece.loopSelectCol();
            Piece.loopSelectRow();
            // BY NOW, THE PLAYER HAS CHOSEN A CELL/PIECE/LOCATION

            chosenPieceSearchRow = 22;
            chosenPieceSearchCol = 22;

            outerloop:
            // piece[2][8]
            for (int row = 0; row < 2; row++) {
                for (int col = 0; col < 8; col++) {
                    if (piece[row][col].coordRow == selectionCoordRow &&
                        piece[row][col].coordCol == selectionCoordCol) {

                        chosenPieceSearchRow = row;
                        chosenPieceSearchCol = col;
                        System.out.print("You have chosen: (" + (selectionVisualCol + selectionVisualRow) + ", "
                                + piece[chosenPieceSearchRow][chosenPieceSearchCol].name + "). ");
                        selection = 1;
                        break outerloop;
                    }
                }
            }

            if (selection == 0) {
                System.out.println("The coordinates that you have introduced do not point to any of your pieces. Please try again.");
            }

        }
    }
    /* AT THE END OF THE METHOD, THE PLAYER WILL HAVE CHOSEN A PIECE OF HIS OWN.
    BY NOW, WE HAVE:
        1. COORDINATES OF THE CELL/PIECE/LOCATION (0-7, 0-7) - selectionCoord Row/Col
        2. VISUAL COORDINATES OF THE CELL/PIECE/LOCATION (A-H, 1-8) - selectionVisual Row/Col
        3. ARRAY COORDINATES OF THE PIECE ([0-1][0-7]) - chosenPieceSearch Row/Col */

    // COLOR-SENSITIVE
    public static String soutSelectedPiece(Piece[][] piece) {
        return ("(" + (selectionVisualCol + selectionVisualRow) + ", "
                + piece[chosenPieceSearchRow][chosenPieceSearchCol].name + ")");
    }


    //=================================================================================================================
    // TRANSLATES INTEGERS (0-7) TO COLUMN LETTER (A-H) AND VICE VERSA

    public static String translateCoordToColumn(int col) {

        if (col == 0) {
            return "A";
        } else if (col == 1) {
            return "B";
        } else if (col == 2) {
            return "C";
        } else if (col == 3) {
            return "D";
        } else if (col == 4) {
            return "E";
        } else if (col == 5) {
            return "F";
        } else if (col == 6) {
            return "G";
        } else if (col == 7) {
            return "H";
        } else return "";
    }
    public static int translateColumnToCoord (String col) {
        if (col.equals("A")) {
            return 0;
        } else if (col.equals("B")) {
            return 1;
        } else if (col.equals("C")) {
            return 2;
        } else if (col.equals("D")) {
            return 2;
        } else if (col.equals("E")) {
            return 2;
        } else if (col.equals("F")) {
            return 2;
        } else if (col.equals("G")) {
            return 2;
        } else if (col.equals("H")) {
            return 2;
        } else return (-1);
    }

    // TRANSLATES NUMBERS (1-8) INTO COORDINATE (0-7) AND VICE VERSA
    public static int translateRowToCoord (int row) {
        if (0<row && row<9) {
            return (8-row);
        } else return (-1);
    }
    public static int translateCoordToRow (int row) {
        if ((-1)<row && row<8) {
            return (8-row);
        } else return (-1);
    }

    //=================================================================================================================
    // FINDING/STORING/SHOWING POSSIBLE MOVES OF THE PIECES

    private static int[][] possibleMove = new int[28][2];
    private static int moveCount = (-1);
    // max nr. of possible moves = 28 (max. moveCount);
    // int[moveCount][0] - row; int[moveCount][1] - col;

    public static void setMoveCount () {
        moveCount = (-1);
    }

    // INITIALIZE possibleMove[i][j] = 0; ONLY NEEDED ONCE
    public static void initializePossibleMove () {
        for (int i = 0; i<28; i++) {
            for (int j = 0; j<2; j++) {
                possibleMove[i][j] = 0;
            }
        }
    }


    // STORES POSSIBLE MOVES
    private static void storeMove (int coordRow, int coordCol) {
        moveCount++;
        possibleMove[moveCount][0] = coordRow;
        possibleMove[moveCount][1] = coordCol;
    }


    // FIND POSSIBLE MOVES TO STORE THEM
    public void findMoves(Piece[][] player1, Piece[][] player2) {}


    // SHOW POSSIBLE MOVES - COLOR SENSITIVE
    public static void showMoves() {

        if (moveCount > (-1)){

            System.out.print("It has the following available moves: ");
            for (int i = 0; i<=moveCount; i++){
                System.out.print( (translateCoordToColumn(possibleMove[i][1]) + (8-possibleMove[i][0])) + "; ");
            }
            System.out.println("\n");

        } else {
            System.out.println("The piece that you have chosen does not have any available moves at the moment. Please choose another piece." + "\n");
        }
    }

    // ================================================================================================================
    // CHOOSING THE FINAL MOVE OF A PIECE
    private static int moveCol;
    private static int moveRow;
    private static String visualMoveCol;
    private static int visualMoveRow;

    private static void selectMoveCol (String col) {
        if (col.equals("A")) {
            moveCol = 0;
        } else if (col.equals("B")) {
            moveCol = 1;
        } else if (col.equals("C")) {
            moveCol = 2;
        } else if (col.equals("D")) {
            moveCol = 3;
        } else if (col.equals("E")) {
            moveCol = 4;
        } else if (col.equals("F")) {
            moveCol = 5;
        } else if (col.equals("G")) {
            moveCol = 6;
        } else if (col.equals("H")) {
            moveCol = 7;
        }

        if ((-1) < moveCol && moveCol < 8){
            visualMoveCol = col;
        }
    }
    private static void loopSelectMoveCol() {
        System.out.println("Where would you like to move your piece? \n" +
                "Please begin by typing in the letter of the column where you would like to move your piece (A-H): ");
        moveCol = (-1);
        Scanner scanner = new Scanner(System.in);
        Piece.selectMoveCol(scanner.nextLine());

        while (moveCol == (-1)) {
            System.out.println("Something went wrong. Please try again. \n" +
                    "Please type only the letter of the column (from A to H):");
            Piece.selectMoveCol(scanner.nextLine());
        }
    }

    private static void selectMoveRow (int row) {

        if (0<row && row<9) {
            moveRow = 8-row;
            visualMoveRow = row;
        }

    }
    private static int innerLoopMoveRow;
    private static void innerLoopMoveRow() {

        try {
            while (moveRow == (-1)) {

                Scanner scanner = new Scanner(System.in);
                Piece.selectMoveRow(scanner.nextInt());

                if(moveRow != (-1)) {
                    innerLoopMoveRow = 1;
                    break;
                }

                System.out.println("The number you have introduced is out of bounds. Please try again. \n" +
                        "Please type the number of the row (from 1 to 8):");
            }
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong. Please try again. \n" +
                    "Please type ONLY the number of the row (from 1 to 8):");
        }
    }
    private static void loopSelectMoveRow () {
        System.out.println("Now, please select the row where you would like to move your piece, by typing the number of the row (from 1 to 8):");
        moveRow = (-1);
        innerLoopMoveRow = 0;

        while (innerLoopMoveRow == 0) {
            innerLoopMoveRow();
        }
    }

    private static void transformWhite(Piece[][] player1, Piece[][] player2) {

        int transformWhite = 0;
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        while (transformWhite == 0) {
            answer = scanner.nextLine();

            if (answer.equals("ROOK")) {
                transformWhite = 1;
                player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Rook();
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "WhiteRook";
                System.out.println("Your pawn has been transformed into a Rook.");

            } else if (answer.equals("KNIGHT")) {
                transformWhite = 1;
                player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Knight();
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "WhiteKnight";
                System.out.println("Your pawn has been transformed into a Knight.");

            } else if (answer.equals("BISHOP")) {
                transformWhite = 1;
                player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Bishop();
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "WhiteBishop";
                System.out.println("Your pawn has been transformed into a Bishop.");

            } else if (answer.equals("QUEEN")) {
                transformWhite = 1;
                player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Queen();
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "WhiteQueen";
                System.out.println("Your pawn has been transformed into a Queen.");

            } else {
                System.out.println("Please try typing the type of piece again. Write only the word.");
            }
        }
    }

    private static void transformBlack(Piece[][] player1, Piece[][] player2) {

        int transformBlack = 0;
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        while (transformBlack == 0) {
            answer = scanner.nextLine();

            if (answer.equals("ROOK")) {
                transformBlack = 1;
                player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Rook();
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "BlackRook";
                System.out.println("Your pawn has been transformed into a Rook.");

            } else if (answer.equals("KNIGHT")) {
                transformBlack = 1;
                player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Knight();
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "BlackKnight";
                System.out.println("Your pawn has been transformed into a Knight.");

            } else if (answer.equals("BISHOP")) {
                transformBlack = 1;
                player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Bishop();
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "BlackBishop";
                System.out.println("Your pawn has been transformed into a Bishop.");

            } else if (answer.equals("QUEEN")) {
                transformBlack = 1;
                player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Queen();
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "BlackQueen";
                System.out.println("Your pawn has been transformed into a Queen.");

            } else {
                System.out.println("Please try typing the type of piece again. Write only the word.");
            }
        }
    }

    //COLOR SENSITIVE
    public static void move(Piece[][] player1, Piece[][] player2, Cell[][] cell) {

        int moving = 0;

        while (moving == 0) {

            moveCount = (-1);
            while (moveCount == (-1)) {

                // WILL RUN UNTIL A PIECE HAS BEEN SELECTED
                Piece.selectPiece(player1);

                // IF MOVES > 0 => MOVECOUNT > (-1)
                player1[Piece.getChosenPieceSearchRow()][Piece.getChosenPieceSearchCol()].findMoves(player1, player2);

                Piece.showMoves();

            }

            int moveLoop = 0;

            moveLoop:
            while (moveLoop == 0) {

                Piece.loopSelectMoveCol();
                Piece.loopSelectMoveRow();
                System.out.println("You have chosen to move your piece (" + (selectionVisualCol + selectionVisualRow) + ", "
                        + player1[chosenPieceSearchRow][chosenPieceSearchCol].name + ") to the following location: (" + (visualMoveCol + visualMoveRow) + ").");

                int tryingToMove = 0;

                tryingToMove:
                while (tryingToMove == 0) {

                    for (int i = 0; i<=moveCount; i++){

                        if (moveRow == possibleMove[i][0] && moveCol == possibleMove[i][1]) {

                            cell[selectionCoordRow][selectionCoordCol].setOccupation("");
                            cell[moveRow][moveCol].setOccupation(player1[chosenPieceSearchRow][chosenPieceSearchCol].getName());
                            player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                            player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                            Cell.showBoard(cell);
                            System.out.println("Your piece (" + (selectionVisualCol + selectionVisualRow) + ", "
                                    + player1[chosenPieceSearchRow][chosenPieceSearchCol].name + ") has been moved to (" + (visualMoveCol + visualMoveRow) + ").");


                            searchPlayer2:
                            for (int row = 0; row<2; row++) {
                                for (int col = 0; col<8; col++) {
                                    if ( (player2[row][col].coordRow == moveRow) && (player2[row][col].coordCol == moveCol) ) {
                                        player2[row][col].remove();
                                        break searchPlayer2;
                                    }
                                }
                            }

                            moving = 1;
                            break moveLoop;
                        }
                    }

                    outerloop:
                    while (tryingToMove == 0) {
                        System.out.println("\n" + "Your piece cannot be moved there at the moment. Would you like to: \n" +
                                "\t" + "1. Try to move your piece to a different location, or \n" +
                                "\t" + "2. Choose another piece to move? \n \n" +
                                "Please type either 1 or 2 to choose your option.");

                        String answer = "0";
                        Scanner scanner = new Scanner(System.in);

                        while ((!answer.equals("1")) || (!answer.equals("2"))) {

                            answer = scanner.nextLine();

                            if (answer.equals("1")) {
                                break tryingToMove;
                            }

                            if (answer.equals("2")) {
                                moveCount = (-1);
                                break moveLoop;
                            }

                            System.out.println("Please try again.");
                        }
                    }
                }
            }
        }


        if ((playerTurn.equals("white")) &&
                (player1[chosenPieceSearchRow][chosenPieceSearchCol].name.equals("WhitePawn")) &&
                (player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordRow() == 0)) {

            System.out.println("\n" + "Your pawn has reached the edge. You can now transform it into any other type of piece. \n" +
                    "What type of piece would you like it to be transformed into? Please write either: ROOK, KNIGHT, BISHOP, or QUEEN.");

            transformWhite(player1, player2);
            cell[moveRow][moveCol].setOccupation(player1[chosenPieceSearchRow][chosenPieceSearchCol].getName());
            Cell.showBoard(cell);

        } else if (playerTurn.equals("black") &&
                (player1[chosenPieceSearchRow][chosenPieceSearchCol].name.equals("BlackPawn")) &&
                (player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordRow() == 7)) {

            System.out.println("\n" + "Your pawn has reached the edge. You can now transform it into any other type of piece. \n" +
                    "What type of piece would you like it to be transformed into? Please write either: ROOK, KNIGHT, BISHOP, or QUEEN.");

            transformBlack(player1, player2);
            cell[moveRow][moveCol].setOccupation(player1[chosenPieceSearchRow][chosenPieceSearchCol].getName());
            Cell.showBoard(cell);
        }
    }

    // ================================================================================================================
    // WHEN A PIECE IS CAPTURED - IT GOES TO (44, 44) - THE PLACE OF DEATHHH
    public void remove(){
        coordRow = 44;
        coordCol = 44;
    }

    // ================================================================================================================
    private static int kingRow;
    private static int kingCol;

    public static int getKingRow() {
        return kingRow;
    }

    public static int getKingCol() {
        return kingCol;
    }

    // AT THE BEGINNING OF EACH TURN, CHECKS IF THE PLAYER'S KING IS IN CHECK
    private static int kingChecked;
    public static void checkIfCheck (Piece[][] player1, Piece[][] player2) {
        kingRow = (-1);
        kingCol = (-1);
        kingChecked = 0;

        // FIND PLAYER1'S KING
        findKing(player1);

        outerloop:
        for (int row = 0; row<2; row++) {
            for (int col = 0; col<8; col++) {
                chosenPieceSearchRow = row;
                chosenPieceSearchCol = col;
                setMoveCount();
                player2[row][col].findMoves(player2, player1);

                if (moveCount > (-1)) {
                    for (int i = 0; i<=moveCount; i++) {
                        if ( (possibleMove[moveCount][0] == player1[kingRow][kingCol].getCoordRow()) &&
                             (possibleMove[moveCount][1] == player1[kingRow][kingCol].getCoordCol()) ) {
                            kingChecked = 1;
                            setMoveCount();
                            break outerloop;
                        }
                    }
                }
            }
        }

        if (kingChecked == 1) {
            System.out.println("Your king is in check. ");
        }
    }


    // FIND PLAYER1'S KING
    public static void findKing(Piece[][] player1) {

        if (playerTurn.equals("white")) {
            for (int row = 0; row<2; row++) {
                for (int col = 0; col<8; col++) {
                    if (player1[row][col].getName().equals("WhiteKing")) {
                        kingRow = row;
                        kingCol = col;
                    }
                }
            }
        } else if (playerTurn.equals("black")) {
            for (int row = 0; row<2; row++) {
                for (int col = 0; col<8; col++) {
                    if (player1[row][col].getName().equals("BlackKing")) {
                        kingRow = row;
                        kingCol = col;
                    }
                }
            }
        }

        // SLOWER
        /*
        for (int row = 0; row<2; row++) {
            for (int col = 0; col<8; col++) {

                if (playerTurn.equals("white")) {
                    if (player1[row][col].getName().equals("WhiteKing")) {
                        kingRow = row;
                        kingCol = col;
                    }
                } else if (playerTurn.equals("black")) {
                    if (player1[row][col].getName().equals("BlackKing")) {
                        kingRow = row;
                        kingCol = col;
                    }
                }
            }
        } */
    }

//=============================================
// TYPES OF PIECES


    static class Pawn extends Piece {

         @Override
         public void findMoves(Piece[][] player1, Piece[][] player2) {

             if (playerTurn.equals("white")) {
                 // PIECE ACQUIRED
                 // CHECKING TO SEE IF THE PAWN CAN MOVE IN FRONT

                 int emptyFront = 0;
                 int emptyFront2 = 0;

                 for (int row = 0; row<2; row++) {
                     for (int col = 0; col<8; col++) {

                         // CHECKING THE SPACE IN FRONT
                         if ( // CHECKING BLACK PIECES
                                 ((player2[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) - 1)) &&
                                  (player2[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) ||
                                         // CHECKING WHITE PIECES
                                 ((player1[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) - 1)) &&
                                  (player1[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol))) {

                             emptyFront = 1;
                         }

                         //IF THE PAWN IS IN STARTING POSITION - CHECKING THE SPACE AFTER THE SPACE IN FRONT (2ND SPACE IN FRONT)
                         if (player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow == 6) {
                             if ( // CHECKING BLACK PIECES
                                     ((player2[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) - 2)) &&
                                      (player2[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) ||
                                             // CHECKING WHITE PIECES
                                     ((player1[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) - 2)) &&
                                      (player1[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol))) {

                                 emptyFront2 = 1;
                             }
                         }
                     }
                 }

                 if (emptyFront == 0) {
                    Piece.storeMove(((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)-1),
                                      player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol);
                 }

                 if (emptyFront == 0 && emptyFront2 == 0 && (player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow == 6)) {
                     Piece.storeMove(((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)-2),
                                       player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol);
                 }

                 // =============== CHECKING TO SEE IF THERE ARE ANY BLACK PIECES ON THE TOP-LEFT AND TOP-RIGHT => MOVES
                 int emptyLeft = 0;
                 int emptyRight = 0;

                 // player2[2][8]
                 for (int row = 0; row<2; row++) {
                     for (int col = 0; col<8; col++) {

                         if ( (player2[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)-1)) &&
                              (player2[row][col].coordCol == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)-1))) {
                             emptyLeft = 1;
                         }

                         if ( (player2[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)-1)) &&
                              (player2[row][col].coordCol == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)+1))) {
                             emptyRight = 1;
                         }
                     }
                 }

                 if (emptyLeft == 1) {
                    Piece.storeMove(((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)-1),
                                    ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)-1));
                 }

                 if (emptyRight == 1) {
                     Piece.storeMove(((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)-1),
                                     ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)+1));
                 }

             } else if (playerTurn.equals("black")) {

                 // PIECE ACQUIRED
                 // CHECKING TO SEE IF THE PAWN CAN MOVE IN FRONT

                 int emptyFront = 0;
                 int emptyFront2 = 0;

                 for (int row = 0; row<2; row++) {
                     for (int col = 0; col<8; col++) {

                         // CHECKING THE SPACE IN FRONT
                         if ( // CHECKING WHITE PIECES
                                 ((player2[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) + 1)) &&
                                         (player2[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) ||
                                         // CHECKING BLACK PIECES
                                         ((player1[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) + 1)) &&
                                                 (player1[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol))) {

                             emptyFront = 1;
                         }

                         //IF THE PAWN IS IN STARTING POSITION - CHECKING THE SPACE AFTER THE SPACE IN FRONT (2ND SPACE IN FRONT)
                         if (player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow == 1) {
                             if ( // CHECKING BLACK PIECES
                                     ((player2[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) + 2)) &&
                                             (player2[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) ||
                                             // CHECKING WHITE PIECES
                                             ((player1[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) + 2)) &&
                                                     (player1[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol))) {

                                 emptyFront2 = 1;
                             }
                         }
                     }
                 }

                 if (emptyFront == 0) {
                     Piece.storeMove(((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)+1),
                             player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol);
                 }

                 if (emptyFront == 0 && emptyFront2 == 0 && (player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow == 1)) {
                     Piece.storeMove(((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)+2),
                             player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol);
                 }

                 // =============== CHECKING TO SEE IF THERE ARE ANY BLACK PIECES ON THE TOP-LEFT AND TOP-RIGHT => MOVES
                 int emptyLeft = 0;
                 int emptyRight = 0;

                 // player2[2][8]
                 for (int row = 0; row<2; row++) {
                     for (int col = 0; col<8; col++) {

                         if ( (player2[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)+1)) &&
                                 (player2[row][col].coordCol == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)-1))) {
                             emptyLeft = 1;
                         }

                         if ( (player2[row][col].coordRow == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)+1)) &&
                                 (player2[row][col].coordCol == ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)+1))) {
                             emptyRight = 1;
                         }
                     }
                 }

                 if (emptyLeft == 1) {
                     Piece.storeMove(((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)+1),
                             ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)-1));
                 }

                 if (emptyRight == 1) {
                     Piece.storeMove(((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)+1),
                             ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)+1));
                 }

             }
         }

         private static void transformWhite(Piece[][] player1, Piece[][] player2) {

             int transformWhite = 0;
             Scanner scanner = new Scanner(System.in);
             String answer = "";

             while (transformWhite == 0) {
                 answer = scanner.nextLine();

                 if (answer.equals("ROOK")) {
                     transformWhite = 1;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Rook();
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "WhiteRook";
                     System.out.println("Your pawn has been transformed into a Rook.");

                 } else if (answer.equals("KNIGHT")) {
                     transformWhite = 1;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Knight();
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "WhiteKnight";
                     System.out.println("Your pawn has been transformed into a Knight.");

                 } else if (answer.equals("BISHOP")) {
                     transformWhite = 1;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Bishop();
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "WhiteBishop";
                     System.out.println("Your pawn has been transformed into a Bishop.");

                 } else if (answer.equals("QUEEN")) {
                     transformWhite = 1;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Queen();
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                     player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "WhiteQueen";
                     System.out.println("Your pawn has been transformed into a Queen.");

                 } else {
                     System.out.println("Please try typing the type of piece again. Write only the word.");
                 }
             }
         }

         private static void transformBlack(Piece[][] player1, Piece[][] player2) {

            int transformBlack = 0;
            Scanner scanner = new Scanner(System.in);
            String answer = "";

            while (transformBlack == 0) {
                answer = scanner.nextLine();

                if (answer.equals("ROOK")) {
                    transformBlack = 1;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Rook();
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "BlackRook";
                    System.out.println("Your pawn has been transformed into a Rook.");

                } else if (answer.equals("KNIGHT")) {
                    transformBlack = 1;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Knight();
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "BlackKnight";
                    System.out.println("Your pawn has been transformed into a Knight.");

                } else if (answer.equals("BISHOP")) {
                    transformBlack = 1;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Bishop();
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "BlackBishop";
                    System.out.println("Your pawn has been transformed into a Bishop.");

                } else if (answer.equals("QUEEN")) {
                    transformBlack = 1;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol] = new Piece.Queen();
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;
                    player1[chosenPieceSearchRow][chosenPieceSearchCol].name = "BlackQueen";
                    System.out.println("Your pawn has been transformed into a Queen.");

                } else {
                    System.out.println("Please try typing the type of piece again. Write only the word.");
                }
            }
        }


         /*@Override
         public void move(Piece[][] player1, Piece[][] player2, Cell[][] cell) {

            int moving = 0;

            while (moving == 0) {

                Piece.loopSelectMoveCol();
                Piece.loopSelectMoveRow();
                System.out.println("You have chosen to move your piece (" + (selectionVisualCol + selectionVisualRow) + ", "
                        + player1[chosenPieceSearchRow][chosenPieceSearchCol].name + ") to the following location: (" + (visualMoveCol + visualMoveRow) + ").");

                int tryingToMove = 0;

                tryingToMove:
                while (tryingToMove == 0) {
                    for (int i = 0; i<=moveCount; i++){
                        if (moveRow == possibleMove[i][0] && moveCol == possibleMove[i][1]) {

                            System.out.println("Your piece has been moved to (" + (visualMoveCol + visualMoveRow) + ").");
                            cell[selectionCoordRow][selectionCoordCol].setOccupation("");
                            cell[moveRow][moveCol].setOccupation(player1[chosenPieceSearchRow][chosenPieceSearchCol].getName());
                            player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow = moveRow;
                            player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol = moveCol;

                            searchPlayer2:
                            for (int row = 0; row<2; row++) {
                                for (int col = 0; col<8; col++) {
                                    if (player2[row][col].coordRow == moveRow && player2[row][col].coordCol == moveCol) {
                                        player2[row][col].remove();
                                        break searchPlayer2;
                                    }
                                }
                            }
                            moving = 1;
                            break tryingToMove;
                        }
                    }

                    outerloop:
                    while (tryingToMove == 0) {
                        System.out.println("\n" + "Your piece cannot be moved there at the moment. Would you like to: \n" +
                                "\t" + "1. Try to move your piece to a different location, or \n" +
                                "\t" + "2. Choose another piece to move? \n \n" +
                                "Please type either 1 or 2 to choose your option.");

                        int answer = 0;
                        Scanner scanner = new Scanner(System.in);

                        while (answer == 0) {

                            answer = scanner.nextInt();

                            if (answer == 1) {
                                break tryingToMove;
                            }

                            if (answer == 2) {
                                moving = 1;
                                break tryingToMove;
                            }

                            System.out.println("Please try again.");
                        }
                    }
                }
            }

            if ((playerTurn.equals("white")) &&
                    (player1[chosenPieceSearchRow][chosenPieceSearchCol].name.equals("WhitePawn")) &&
                    (player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordRow() == 0)) {

                System.out.println("\n" + "Your pawn has reached the edge. You can now transform it into any other type of piece. \n" +
                        "What type of piece would you like it to be transformed into? Please write either: ROOK, KNIGHT, BISHOP, or QUEEN.");

                transformWhite(player1, player2);
                cell[moveRow][moveCol].setOccupation(player1[chosenPieceSearchRow][chosenPieceSearchCol].getName());

            } else if (playerTurn.equals("black") &&
                    (player1[chosenPieceSearchRow][chosenPieceSearchCol].name.equals("BlackPawn")) &&
                    (player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordRow() == 7)) {

                System.out.println("\n" + "Your pawn has reached the edge. You can now transform it into any other type of piece. \n" +
                        "What type of piece would you like it to be transformed into? Please write either: ROOK, KNIGHT, BISHOP, or QUEEN.");

                transformBlack(player1, player2);
                cell[moveRow][moveCol].setOccupation(player1[chosenPieceSearchRow][chosenPieceSearchCol].getName());
            }
        } */


    }

    static class Rook extends Piece {

        @Override
        public void findMoves(Piece[][] player1, Piece[][] player2) {

            //FIND POSSIBLE MOVES TO THE LEFT
            findingLeft:
            for (int i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordCol())-1); ((-1)<i) && (i<8); i--) {

                // i = column;

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) &&
                            (player2[row][col].coordCol == i)) {
                            Piece.storeMove(player2[row][col].coordRow, i);
                            break findingLeft;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) &&
                                   (player1[row][col].coordCol == i)) {
                            break findingLeft;

                        }
                    }
                }

                Piece.storeMove(player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow, i);

            }

            // FIND POSSIBLE MOVES TO THE RIGHT
            findingRight:
            for (int i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordCol())+1); ((-1)<i) && (i<8); i++) {

                // i = column;

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) &&
                            (player2[row][col].coordCol == i)) {
                            Piece.storeMove(player2[row][col].coordRow, i);
                            break findingRight;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) &&
                                   (player1[row][col].coordCol == i)) {
                            break findingRight;

                        }
                    }
                }

                Piece.storeMove(player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow, i);

            }

            // FIND POSSIBLE MOVES ABOVE
            findingAbove:
            for (int i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordRow())-1); ((-1)<i) && (i<8); i--) {

                // i = row;

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                            (player2[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) {
                            Piece.storeMove(i, player2[row][col].coordCol);
                            break findingAbove;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                   (player1[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) {
                            break findingAbove;

                        }
                    }
                }

                Piece.storeMove(i, player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol);

            }

            // FIND POSSIBLE MOVES BELOW
            findingBelow:
            for (int i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordRow())+1); ((-1)<i) && (i<8); i++) {

                // i = row;

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                            (player2[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) {
                            Piece.storeMove(i, player2[row][col].coordCol);
                            break findingBelow;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                   (player1[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) {
                            break findingBelow;

                        }
                    }
                }

                Piece.storeMove(i, player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol);

            }

        }
    }

    static class Knight extends Piece {

        @Override
        public void findMoves(Piece[][] player1, Piece[][] player2) {

            int i = player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow;
            int j = player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol;

            // MOVES ABOVE ==========================================================================================
            int topLeft = (-1);
            int topRight = (-1);

            boolean booleanTopLeft =
                    ( (-1) < (i-2) ) &&
                    ( (-1) < (j-1) ) &&
                    ( (i-2) < 8 ) &&
                    ( (j-1) < 8 );

            boolean booleanTopRight =
                    ( (-1) < (i-2) ) &&
                    ( (-1) < (j+1) ) &&
                    ( (i-2) < 8 ) &&
                    ( (j+1) < 8 ) ;

            if (booleanTopLeft) topLeft = 0;
            if (booleanTopRight) topRight = 0;

            // MOVES BELOW ==========================================================================================
            int bottomLeft = (-1);
            int bottomRight = (-1);

            boolean booleanBottomLeft =
                    ( (-1) < (i+2) ) &&
                    ( (-1) < (j-1) ) &&
                    ( (i+2) < 8 ) &&
                    ( (j-1) < 8 );

            boolean booleanBottomRight =
                    ( (-1) < (i+2) ) &&
                    ( (-1) < (j+1) ) &&
                    ( (i+2) < 8 ) &&
                    ( (j+1) < 8 );

            if (booleanBottomLeft) bottomLeft = 0;
            if (booleanBottomRight) bottomRight = 0;


            // MOVES TO THE LEFT  ===================================================================================
            int leftLeft = (-1);
            int leftRight = (-1);

            boolean booleanLeftLeft =
                    ( (-1) < (i+1) ) &&
                    ( (-1) < (j-2) ) &&
                    ( (i+1) < 8 ) &&
                    ( (j-2) < 8 );

            boolean booleanLeftRight =
                    ( (-1) < (i-1) ) &&
                    ( (-1) < (j-2) ) &&
                    ( (i-1) < 8 ) &&
                    ( (j-2) < 8 );

            if (booleanLeftLeft) leftLeft = 0;
            if (booleanLeftRight) leftRight = 0;

            // MOVES TO THE RIGHT ===================================================================================
            int rightLeft = (-1);
            int rightRight = (-1);

            boolean booleanRightLeft =
                    ( (-1) < (i-1) ) &&
                    ( (-1) < (j+2) ) &&
                    ( (i-1) < 8 ) &&
                    ( (j+2) < 8 );

            boolean booleanRightRight =
                    ( (-1) < (i+1) ) &&
                    ( (-1) < (j+2) ) &&
                    ( (i+1) < 8 ) &&
                    ( (j+2) < 8 );

            if (booleanRightLeft) rightLeft = 0;
            if (booleanRightRight) rightRight = 0;


            // CHECKING OWN PIECES ===================================================================================
            for (int row = 0; row<2; row++) {
                for (int col = 0; col<8; col++) {

                    // CHECKING FOR MOVES ABOVE =======================================================================
                    if ((player1[row][col].coordRow == (i-2)) &&
                        (player1[row][col].coordCol == (j-1))) {
                        topLeft = 1;
                    }

                    if ((player1[row][col].coordRow == (i-2)) &&
                        (player1[row][col].coordCol == (j+1))) {
                        topRight = 1;
                    }

                    // CHECKING FOR MOVES BELOW =======================================================================
                    if ((player1[row][col].coordRow == (i+2)) &&
                        (player1[row][col].coordCol == (j-1))) {
                        bottomLeft = 1;
                    }

                    if ((player1[row][col].coordRow == (i+2)) &&
                        (player1[row][col].coordCol == (j+1))) {
                        bottomRight = 1;
                    }

                    // CHECKING FOR MOVES TO THE LEFT =================================================================
                    if ((player1[row][col].coordRow == (i+1)) &&
                        (player1[row][col].coordCol == (j-2))) {
                        leftLeft = 1;
                    }

                    if ((player1[row][col].coordRow == (i-1)) &&
                        (player1[row][col].coordCol == (j-2))) {
                        leftRight = 1;
                    }
                    // CHECKING FOR MOVES TO THE RIGHT ================================================================
                    if ((player1[row][col].coordRow == (i-1)) &&
                        (player1[row][col].coordCol == (j+2))) {
                        rightLeft = 1;
                    }

                    if ((player1[row][col].coordRow == (i+1)) &&
                        (player1[row][col].coordCol == (j+2))) {
                        rightRight = 1;
                    }

                }
            }

            // STORING MOVES ========================================================================================
            // MOVES TO THE LEFT
            if (leftLeft == 0) Piece.storeMove((i+1),(j-2));
            if (leftRight == 0) Piece.storeMove((i-1),(j-2));

            // MOVES ABOVE
            if (topLeft == 0) Piece.storeMove((i-2),(j-1));
            if (topRight == 0) Piece.storeMove((i-2),(j+1));

            // MOVES TO THE RIGHT
            if (rightLeft == 0) Piece.storeMove((i-1),(j+2));
            if (rightRight == 0) Piece.storeMove((i+1),(j+2));

            // MOVES BELOW
            if (bottomRight == 0) Piece.storeMove((i+2),(j+1));
            if (bottomLeft == 0) Piece.storeMove((i+2),(j-1));

        }

    }

    static class Bishop extends Piece {

        @Override
        public void findMoves(Piece[][] player1, Piece[][] player2) {

            int i; // search row
            int j; // search col

            // FINDING MOVES IN THE TOP-LEFT CORNER
            i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)-1);
            j = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)-1);

            findingTopLeft:
            for (; (( (-1) < i ) && (i<8)) &&
                   (( (-1) < j ) && (j<8)); i--, j--) {

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                            (player2[row][col].coordCol == j)) {
                            Piece.storeMove(i, j);
                            break findingTopLeft;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                   (player1[row][col].coordCol == j)) {
                            break findingTopLeft;

                        }

                    }
                }

                Piece.storeMove(i, j);
            }


            // FINDING MOVES IN THE TOP-RIGHT CORNER
            i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)-1);
            j = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)+1);

            findingTopRight:
            for (; (( (-1) < i ) && (i<8)) &&
                   (( (-1) < j ) && (j<8)); i--, j++) {

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                            (player2[row][col].coordCol == j)) {
                            Piece.storeMove(i, j);
                            break findingTopRight;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                   (player1[row][col].coordCol == j)) {
                            break findingTopRight;

                        }

                    }
                }

                Piece.storeMove(i, j);
            }

            // FINDING MOVES IN THE BOTTOM-RIGHT CORNER
            i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)+1);
            j = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)+1);

            findingBottomRight:
            for (; (( (-1) < i ) && (i<8)) &&
                    (( (-1) < j ) && (j<8)); i++, j++) {

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                                (player2[row][col].coordCol == j)) {
                            Piece.storeMove(i, j);
                            break findingBottomRight;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                (player1[row][col].coordCol == j)) {
                            break findingBottomRight;

                        }

                    }
                }

                Piece.storeMove(i, j);
            }

            // FINDING MOVES IN THE BOTTOM-LEFT CORNER
            i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)+1);
            j = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)-1);

            findingBottomLeft:
            for (; (( (-1) < i ) && (i<8)) &&
                   (( (-1) < j ) && (j<8)); i++, j--) {

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                            (player2[row][col].coordCol == j)) {
                            Piece.storeMove(i, j);
                            break findingBottomLeft;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                   (player1[row][col].coordCol == j)) {
                            break findingBottomLeft;

                        }

                    }
                }

                Piece.storeMove(i, j);
            }
        }
    }

    static class Queen extends Piece {

        @Override
        public void findMoves(Piece[][] player1, Piece[][] player2) {

            int i; // search row
            int j; // search col


            // FIND POSSIBLE MOVES TO THE LEFT =========================================================================
            findingLeft:
            for (i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordCol())-1); ((-1)<i) && (i<8); i--) {

                // i = column;

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) &&
                                (player2[row][col].coordCol == i)) {
                            Piece.storeMove(player2[row][col].coordRow, i);
                            break findingLeft;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) &&
                                (player1[row][col].coordCol == i)) {
                            break findingLeft;

                        }
                    }
                }

                Piece.storeMove(player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow, i);

            }


            // FINDING MOVES IN THE TOP-LEFT CORNER ====================================================================
            i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)-1);
            j = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)-1);

            findingTopLeft:
            for (; (( (-1) < i ) && (i<8)) &&
                    (( (-1) < j ) && (j<8)); i--, j--) {

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                                (player2[row][col].coordCol == j)) {
                            Piece.storeMove(i, j);
                            break findingTopLeft;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                (player1[row][col].coordCol == j)) {
                            break findingTopLeft;

                        }

                    }
                }

                Piece.storeMove(i, j);
            }


            // FIND POSSIBLE MOVES ABOVE ===============================================================================
            findingAbove:
            for (i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordRow())-1); ((-1)<i) && (i<8); i--) {

                // i = row;

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                                (player2[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) {
                            Piece.storeMove(i, player2[row][col].coordCol);
                            break findingAbove;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                (player1[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) {
                            break findingAbove;

                        }
                    }
                }

                Piece.storeMove(i, player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol);

            }


            // FINDING MOVES IN THE TOP-RIGHT CORNER ===================================================================
            i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)-1);
            j = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)+1);

            findingTopRight:
            for (; (( (-1) < i ) && (i<8)) &&
                    (( (-1) < j ) && (j<8)); i--, j++) {

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                                (player2[row][col].coordCol == j)) {
                            Piece.storeMove(i, j);
                            break findingTopRight;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                (player1[row][col].coordCol == j)) {
                            break findingTopRight;

                        }

                    }
                }

                Piece.storeMove(i, j);
            }


            // FIND POSSIBLE MOVES TO THE RIGHT ========================================================================
            findingRight:
            for (i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordCol())+1); ((-1)<i) && (i<8); i++) {

                // i = column;

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) &&
                                (player2[row][col].coordCol == i)) {
                            Piece.storeMove(player2[row][col].coordRow, i);
                            break findingRight;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow) &&
                                (player1[row][col].coordCol == i)) {
                            break findingRight;

                        }
                    }
                }

                Piece.storeMove(player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow, i);

            }


            // FINDING MOVES IN THE BOTTOM-RIGHT CORNER ================================================================
            i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)+1);
            j = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)+1);

            findingBottomRight:
            for (; (( (-1) < i ) && (i<8)) &&
                    (( (-1) < j ) && (j<8)); i++, j++) {

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                                (player2[row][col].coordCol == j)) {
                            Piece.storeMove(i, j);
                            break findingBottomRight;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                (player1[row][col].coordCol == j)) {
                            break findingBottomRight;

                        }

                    }
                }

                Piece.storeMove(i, j);
            }


            // FIND POSSIBLE MOVES BELOW ===============================================================================
            findingBelow:
            for (i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].getCoordRow())+1); ((-1)<i) && (i<8); i++) {

                // i = row;

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                                (player2[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) {
                            Piece.storeMove(i, player2[row][col].coordCol);
                            break findingBelow;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                (player1[row][col].coordCol == player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)) {
                            break findingBelow;

                        }
                    }
                }

                Piece.storeMove(i, player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol);

            }


            // FINDING MOVES IN THE BOTTOM-LEFT CORNER =================================================================
            i = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow)+1);
            j = ((player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol)-1);

            findingBottomLeft:
            for (; (( (-1) < i ) && (i<8)) &&
                    (( (-1) < j ) && (j<8)); i++, j--) {

                for (int row = 0; row<2; row++) {
                    for (int col = 0; col<8; col++) {

                        // CHECK OPPONENT'S PIECES
                        if ((player2[row][col].coordRow == i) &&
                                (player2[row][col].coordCol == j)) {
                            Piece.storeMove(i, j);
                            break findingBottomLeft;

                            // CHECK OWN PIECES
                        } else if ((player1[row][col].coordRow == i) &&
                                (player1[row][col].coordCol == j)) {
                            break findingBottomLeft;

                        }

                    }
                }

                Piece.storeMove(i, j);
            }

        }
    }

    static class King extends Piece {

        @Override
        public void findMoves(Piece[][] player1, Piece[][] player2) {

            int i = player1[chosenPieceSearchRow][chosenPieceSearchCol].coordRow;
            int j = player1[chosenPieceSearchRow][chosenPieceSearchCol].coordCol;

            int[] cell = new int[9];

            for (int row = 1; row<9; row++) cell[row] = (-1);

            boolean[] booleanCell = new boolean[9];


            booleanCell[1] =
                    ( (-1) < (i-1) ) &&
                    ( (-1) < (j-1) ) &&
                    ( (i-1) < 8 ) &&
                    ( (j-1) < 8 );

            booleanCell[2] =
                    ( (-1) < (i-1) ) &&
                    ( (-1) < (j) ) &&
                    ( (i-1) < 8 ) &&
                    ( (j) < 8 );

            booleanCell[3] =
                    ( (-1) < (i-1) ) &&
                    ( (-1) < (j+1) ) &&
                    ( (i-1) < 8 ) &&
                    ( (j+1) < 8 );

            booleanCell[4] =
                    ( (-1) < (i) ) &&
                    ( (-1) < (j+1) ) &&
                    ( (i) < 8 ) &&
                    ( (j+1) < 8 );

            booleanCell[5] =
                    ( (-1) < (i+1) ) &&
                    ( (-1) < (j+1) ) &&
                    ( (i+1) < 8 ) &&
                    ( (j+1) < 8 );

            booleanCell[6] =
                    ( (-1) < (i+1) ) &&
                    ( (-1) < (j) ) &&
                    ( (i+1) < 8 ) &&
                    ( (j) < 8 );

            booleanCell[7] =
                    ( (-1) < (i+1) ) &&
                    ( (-1) < (j-1) ) &&
                    ( (i+1) < 8 ) &&
                    ( (j-1) < 8 );

            booleanCell[8] =
                    ( (-1) < (i) ) &&
                    ( (-1) < (j-1) ) &&
                    ( (i) < 8 ) &&
                    ( (j-1) < 8 );

            for (int row = 1; row<9; row++) {
                if (booleanCell[row]) cell[row] = 0;
            }

            for (int row = 0; row<2; row++) {
                for (int col = 0; col<8; col++) {

                    // CELL 1 ==========================================================================================
                    if ( (player1[row][col].coordRow == (i-1) ) &&
                         (player1[row][col].coordCol == (j-1) ) ) {
                        cell[1] = 1;
                    }


                    // CELL 2 ==========================================================================================
                    if ( (player1[row][col].coordRow == (i-1) ) &&
                         (player1[row][col].coordCol == j) ) {
                        cell[2] = 1;
                    }


                    // CELL 3 ==========================================================================================
                    if ( (player1[row][col].coordRow == (i-1) ) &&
                         (player1[row][col].coordCol == (j+1) ) ) {
                        cell[3] = 1;
                    }


                    // CELL 4 ==========================================================================================
                    if ( (player1[row][col].coordRow == i) &&
                         (player1[row][col].coordCol == (j+1) ) ) {
                        cell[4] = 1;
                    }


                    // CELL 5 ==========================================================================================
                    if ( (player1[row][col].coordRow == (i+1) ) &&
                         (player1[row][col].coordCol == (j+1) ) ) {
                        cell[5] = 1;
                    }


                    // CELL 6 ==========================================================================================
                    if ( (player1[row][col].coordRow == (i+1) ) &&
                         (player1[row][col].coordCol == j) ) {
                        cell[6] = 1;
                    }


                    // CELL 7 ==========================================================================================
                    if ( (player1[row][col].coordRow == (i+1) ) &&
                         (player1[row][col].coordCol == (j-1) ) ) {
                        cell[7] = 1;
                    }


                    // CELL 8 ==========================================================================================
                    if ( (player1[row][col].coordRow == i) &&
                         (player1[row][col].coordCol == (j-1) ) ) {
                        cell[8] = 1;
                    }
                }
            }

            if ((cell[1]) == 0) Piece.storeMove( (i-1), (j-1) );
            if ((cell[2]) == 0) Piece.storeMove( (i-1), (j) );
            if ((cell[3]) == 0) Piece.storeMove( (i-1), (j+1) );
            if ((cell[4]) == 0) Piece.storeMove( (i), (j+1) );
            if ((cell[5]) == 0) Piece.storeMove( (i+1), (j+1) );
            if ((cell[6]) == 0) Piece.storeMove( (i+1), (j) );
            if ((cell[7]) == 0) Piece.storeMove( (i+1), (j-1) );
            if ((cell[8]) == 0) Piece.storeMove( (i), (j-1) );

        }
    }
}
