
    public class Aiplayer extends Player {
        public Aiplayer (String name, char mark) {

            super(name, mark);
        }
        @Override
        void makeMove(char[][] board) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] ==' ') {
                        board[i][j] = mark;
                        return;
                    }
                }
            }
        }
    }

