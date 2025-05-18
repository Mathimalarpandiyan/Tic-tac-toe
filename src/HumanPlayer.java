
    import java.util.Scanner;

    public class HumanPlayer extends Player {
        Scanner scanner = new Scanner(System.in);

        public HumanPlayer(String name, char mark) {

            super(name, mark);
        }

        @Override
        void makeMove(char[][] board) {
            int row, col;
            while (true) {
                System.out.print("Enter row and col: ");
                row = scanner.nextInt();
                col = scanner.nextInt();
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = mark;
                   break;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }
        }
    }

