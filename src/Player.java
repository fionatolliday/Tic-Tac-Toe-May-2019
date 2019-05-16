public class Player {

    private String name;
    private char playerPiece;


    public String getName() {
        return name;
    }


    public char getPlayerPiece() {
        return playerPiece;
    }



    public Player(String name, char playerPiece){
        this.name = name;
        this.playerPiece = playerPiece;
    }

}
