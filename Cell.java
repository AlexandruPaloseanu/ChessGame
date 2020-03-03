package TestChess.ChessGame;

public class Cell {

    private String position;
    private String occupation;


    public void setOccupation(String occupation) {this.occupation = occupation;}

    private static String translateColRowToPosition (int col, int row) {
        if (col == 0) {
            return ("A" + (8-row));
        } else if (col == 1) {
            return ("B" + (8-row));
        } else if (col == 2) {
            return ("C" + (8-row));
        } else if (col == 3) {
            return ("D" + (8-row));
        } else if (col == 4) {
            return ("E" + (8-row));
        } else if (col == 5) {
            return ("F" + (8-row));
        } else if (col == 6) {
            return ("G" + (8-row));
        } else if (col == 7) {
            return ("H" + (8-row));
        } else return null;
    }

    // SETS position, occupation, coordRow, CoordCol;
    public static void initializeCells(Cell cell[][]) {

        // INITIALIZE CELLS + INITIALIZE POSITION/OCCUPATION OF CELLS
        for (int col = 0; col<8; col++) {
            for (int row = 0; row<8; row++) {

                cell[row][col] = new Cell();
                cell[row][col].position = translateColRowToPosition(col, row);
                cell[row][col].occupation = "";
            }
        }

        //=================== WHITE OCCUPATION ======================
        //OCCUPATION - WHITE PAWNS
        for (int col = 0; col<8; col++) { cell[6][col].occupation = "WhitePawn"; }

        //OCCUPATION - WHITE ROOKS
        cell[7][0].occupation = "WhiteRook";
        cell[7][7].occupation = "WhiteRook";

        //OCCUPATION - WHITE KNIGHTS
        cell[7][1].occupation = "WhiteKnight";
        cell[7][6].occupation = "WhiteKnight";

        //OCCUPATION - WHITE BISHOPS
        cell[7][2].occupation = "WhiteBishop";
        cell[7][5].occupation = "WhiteBishop";

        //OCCUPATION - WHITE QUEEN
        cell[7][3].occupation = "WhiteQueen";

        //OCCUPATION - WHITE KING
        cell[7][4].occupation = "WhiteKing";



        //=================== BLACK OCCUPATION ======================
        //OCCUPATION - BLACK PAWNS
        for (int col = 0; col<8; col++) { cell[1][col].occupation = "BlackPawn"; }

        //OCCUPATION - BLACK ROOKS
        cell[0][0].occupation = "BlackRook";
        cell[0][7].occupation = "BlackRook";

        //OCCUPATION - BLACK KNIGHTS
        cell[0][1].occupation = "BlackKnight";
        cell[0][6].occupation = "BlackKnight";

        //OCCUPATION - BLACK BISHOPS
        cell[0][2].occupation = "BlackBishop";
        cell[0][5].occupation = "BlackBishop";

        //OCCUPATION - BLACK QUEEN
        cell[0][3].occupation = "BlackQueen";

        //OCCUPATION - BLACK KING
        cell[0][4].occupation = "BlackKing";

    }

    public void showPosition() {System.out.print("      " + position + "      ");}

    public void showOccupation() {

        // PAWN
        if (occupation.equals("WhitePawn")) {System.out.print("  " + "WhitePawn" + "   ");
        } else if (occupation.equals("BlackPawn")) {System.out.print("  " + "BlackPawn" + "   ");

            // ROOK
        } else if (occupation.equals("WhiteRook")) {System.out.print("  " + "WhiteRook" + "   ");
        } else if (occupation.equals("BlackRook")) {System.out.print("  " + "BlackRook" + "   ");

            // KNIGHT
        } else if (occupation.equals("WhiteKnight")) {System.out.print(" " + "WhiteKnight" + "  ");
        } else if (occupation.equals("BlackKnight")) {System.out.print(" " + "BlackKnight" + "  ");

            // BISHOP
        } else if (occupation.equals("WhiteBishop")) {System.out.print(" " + "WhiteBishop" + "  ");
        } else if (occupation.equals("BlackBishop")) {System.out.print(" " + "BlackBishop" + "  ");

            // QUEEN
        } else if (occupation.equals("WhiteQueen")) {System.out.print("  " + "WhiteQueen" + "  ");
        } else if (occupation.equals("BlackQueen")) {System.out.print("  " + "BlackQueen" + "  ");

            // KING
        } else if (occupation.equals("WhiteKing")) {System.out.print("  " + "WhiteKing" + "   ");
        } else if (occupation.equals("BlackKing")) {System.out.print("  " + "BlackKing" + "   ");

            // UNOCCUPIED
        } else System.out.print("              ");

    }

    // USES showPosition() and showOccupation()
    public static void showBoard(Cell cell[][]) {
        for (int row = 0; row<8; row++) {

            System.out.println("_________________________________________________________________________________________________________________________");
            System.out.print("|");
            for (int col = 0; col<8; col++) {
                cell[row][col].showPosition();
                System.out.print("|");
            }

            System.out.println();

            System.out.print("|");
            for (int col = 0; col<8; col++) {
                cell[row][col].showOccupation();
                System.out.print("|");
            }
            System.out.println();

        }
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println();
    }

}
