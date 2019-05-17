public class TurnDecider {

    Player player1 = new Player("Player 1", 'x');
    Player player2 = new Player("Player 2", 'o');
    Game game = new Game();



    public String getCurrentPlayer() {
        if (game.getNumOfPlays() % 2 == 0) {
            return player1.getName();

        } else
            return player2.getName();
    }

    public String getNextPlayer() {
        if (getCurrentPlayer() == player1.getName()) {
            return player2.getName();

        } else
            return player1.getName();
    }


    public char getCurrentPlayerPiece() {
        if (game.getNumOfPlays() % 2 == 0) {
            return player1.getPlayerPiece();

        } else
            return player2.getPlayerPiece();
    }

    public char getNextPlayerPiece() {
        if (getCurrentPlayerPiece() == player1.getPlayerPiece()) {
            return player2.getPlayerPiece();

        } else
            return player1.getPlayerPiece();
    }


}
