public class Gameboard {
    static char[][] board = new char[3][3];

    public Gameboard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void display() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static boolean conditionToWin() {
        // rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' &&
                    board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2]) return true;

            if (board[0][i] != ' ' &&
                    board[0][i] == board[1][i] &&
                    board[1][i] == board[2][i]) return true;
        }

        // diagonals
        if (board[0][0] != ' ' &&
                board[0][0] == board[1][1] &&
                board[1][1] == board[2][2]) return true;

        if (board[0][2] != ' ' &&
                board[0][2] == board[1][1] &&
                board[1][1] == board[2][0]) return true;

        return false;
    }

    public static boolean conditionToDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ') return false;
        return true;
    }
}