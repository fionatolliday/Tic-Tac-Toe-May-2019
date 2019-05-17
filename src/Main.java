import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Messages messagePrinter = new Messages();
        Board board = new Board();
        Game game = new Game();
        Scanner userInput = new Scanner(System.in);

        game.getNumOfPlays();

        messagePrinter.messageOutput(MsgEnum.WELCOME);
        messagePrinter.messageOutput(MsgEnum.CURRENTBOARD);

        System.out.println(board.printTheBoard());

        messagePrinter.messageOutput(MsgEnum.OPENINGINSTRUCTIONS);
        String readUserInput = userInput.nextLine();


    }


}
