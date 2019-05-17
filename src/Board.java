import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {


    private List<List<String>> board;

    public List<List<String>> getBoard() {
        return board;
    }


    public Board() {
        this.board = new ArrayList<>();
        List<String> row1 = Arrays.asList(".", ".", ".");
        List<String> row2 = Arrays.asList(".", ".", ".");
        List<String> row3 = Arrays.asList(".", ".", ".");

        this.board.add(row1);
        this.board.add(row2);
        this.board.add(row3);

    }

    public String printTheBoard() {
//        create a list where we will put in all of the rows joined together
        List<String> rows = new ArrayList<>();

//        jump into the 3 arrays and join the dots with a space
        for (List<String> innerArray : board) {
                rows.add(String.join(" ", innerArray));
        }
//        return the rows with a line break between.
        return String.join("\n", rows);
    }

}
