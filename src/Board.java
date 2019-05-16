import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {


    private ArrayList<List<String>> board;

    public ArrayList<List<String>> getBoard() {
        return board;
    }




    public Board(){
        this.board = new ArrayList<>();
        List<String> inner1 = Arrays.asList("."+"."+".");
        List<String> inner2 = Arrays.asList("."+"."+".");
        List<String> inner3 = Arrays.asList("."+"."+".");

        this.board.add(inner1);
        this.board.add(inner2);
        this.board.add(inner3);

    }


    public String printTheBoard(){
        String printBoard = "";
        for (List<String> innerArray : board) {
            for (String position: innerArray )
            printBoard += position + "\n";
        } return printBoard;


    }
}
