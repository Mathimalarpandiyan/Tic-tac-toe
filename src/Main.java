public class Main {
    public static void main(String[] args) {
       Gameboard game= new Gameboard();
        HumanPlayer p1 = new HumanPlayer("Your", 'X');
        Aiplayer p2 = new Aiplayer("AI", 'O');
        Player cp = p1;

        while (true) {
            System.out.println(cp.name + "'s turn");
            cp.makeMove(Gameboard.board);
            game.display();

            if (Gameboard.conditionToWin()) {
                System.out.println(cp.name + " has won!");
                break;
            } else if (Gameboard.conditionToDraw()) {
                System.out.println("It's a draw!");
                break;
            }

            cp = (cp == p1) ? p2 : p1;
        }
    }
}


