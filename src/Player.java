
    public abstract class Player {
        String name;
        char mark;

        Player(String name, char mark) {
            this.name = name;
            this.mark = mark;
        }

        abstract void makeMove(char[][] board);
    }

