import java.util.Scanner;

//        if user input is q, System.exit
//    check the coordinates to see if they are taken
//        Check if the coordinates are valid
//      Then ultimately need to check for a win.

public class Coordinates {

    Scanner userInput = new Scanner(System.in);
    String readUserInput = userInput.nextLine();
    Messages messagePrinter = new Messages();

    public void checkForValidCoordinates(){
        String[] userCoordinatesSplit = readUserInput.split(",");
        String coordinateX = userCoordinatesSplit[0];
        String coordinateY = userCoordinatesSplit[1];

        int x = Integer.parseInt(coordinateX);
        int y = Integer.parseInt(coordinateY);

        if ( x > 3 || x <1 || y > 3 || y < 1){
             messagePrinter.messageOutput(MsgEnum.INCORRECTCOORDS);
        }

//        coordinates must have 2 integers seperated by a comma (convert String to ints and split
        //        on comma?)
//        each integer must be between(and inclusive of) 1 and 3
    }



}
