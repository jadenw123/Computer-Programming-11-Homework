import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        //scoreboard
        int playerwin = 0;
        int compwin = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //player picks rock paper scissor
        String r = "rock";
        String s = "scissor";
        String p = "paper";

        String[] plays = {r, p, s};

        //player can quit
        String q = "quit";


        //player can choose to continue or quit
        boolean quit = false;

        //player choice 2 for quiting or keep going
        String ComChoice;
        String PlayChoice;
        String PlayChoice2;

        int index;

        //looping game
        while (!quit) {
            System.out.println("Pick Rock, Paper, Scissor");
            PlayChoice = scanner.next();

            //computer pick 1 2 3 rock paper scissor
            index = random.nextInt(3);
            ComChoice = plays[index];


            //all the outcomes that can happen
            System.out.println("Player choice:" + PlayChoice + " Computer Choice:" + ComChoice);

            if (PlayChoice.equals(ComChoice)) {
                System.out.println("Draw");

            } else if (PlayChoice.equals(r) && ComChoice.equals(p)) {

                System.out.println("Computer Wins");
                compwin ++;

            } else if (PlayChoice.equals(r) && ComChoice.equals(s)) {

                System.out.println("You Win");
                playerwin ++;

            } else if (PlayChoice.equals(p) && ComChoice.equals(r)) {

                System.out.println("You Win");
                playerwin ++;

            } else if (PlayChoice.equals(p) && ComChoice.equals(s)) {

                System.out.println("Computer Wins");
                compwin ++;

            } else if (PlayChoice.equals(s) && ComChoice.equals(r)) {

                System.out.println("Computer Wins");
                compwin ++;

            } else if (PlayChoice.equals(s) && ComChoice.equals(p)) {

                System.out.println("You Win");
                playerwin ++;

            }
            //scoreboard
            System.out.println("Your Wins: "+playerwin);
            System.out.println("Computer Wins: "+compwin);

            //keep playing or quit
            System.out.println(" Again or Quit");
            PlayChoice2 = scanner.next();
            if (PlayChoice2.equals(q)) {
                quit = true;

            //player cant pick invalid option
            if (PlayChoice.equals(r p s))
            System.out.println("Pick Valid Option");


            }

        }

    }
}


