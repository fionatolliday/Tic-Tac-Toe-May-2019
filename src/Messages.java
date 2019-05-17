public class MessagesEnum {

    TurnDecider turnDecider = new TurnDecider();


    public enum Messages {
        WELCOME, CURRENTBOARD, INSTRUCTIONS, MOVEACCEPTED, SPOTTAKEN, GAMEWON, INCORRECTCOORDS,
        GAMEDRAW

    }

    Messages message;

    public void MessageEnum(Messages message) {
        this.message = message;
    }

    public void messageOutput() {
        switch (message) {
            case WELCOME:
                System.out.println("Welcome to Tic Tac Toe!");
                break;

            case CURRENTBOARD:
                System.out.println("Here's the current board:");
                break;

            case INSTRUCTIONS:
                System.out.println(turnDecider.getNextPlayer() + "enter a coord x,y to place your " + turnDecider.getNextPlayerPiece() + " or enter 'q' to give up: ");
                break;

            case MOVEACCEPTED:
                System.out.println("Move accepted, here's the current board: ");
                break;

            case SPOTTAKEN:
                System.out.println("Oh no, a piece is already at this place! Try again... ");
                break;

            case GAMEWON:
                System.out.println("Move accepted, well done you've won the game! ");
                break;

            case INCORRECTCOORDS:
                System.out.println("Please check your coordinates and try again. ");
                break;

            case GAMEDRAW:
                System.out.println("No one won this time. Game draw. ");
                break;

        }
    }

}
