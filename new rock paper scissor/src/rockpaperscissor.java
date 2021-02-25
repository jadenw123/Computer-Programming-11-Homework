import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        //scoreboard
        int playWins = 0;
        int comWins = 0;

        String y = "yes";
        String n = "no";
        String playAgain;

        int playChoice;
        int comChoice;
        int random;


        boolean quit = true;
        while (quit) {


            //player to pick their choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type 1 for Rock, 2 for Paper, or 3 for Scissor");
            playChoice = scanner.nextInt();


            //if player does not pick given options
            while (playChoice != 1 && playChoice != 2 && playChoice != 3){
                System.out.println("Please Pick a Valid Option");
                playChoice = scanner.nextInt();

            }

            //computer's choice
            random = (int) (Math.random() * 3 + 1);
            comChoice = random;


            //all possible outcomes
            if (playChoice == 1 && comChoice == 1) {
                System.out.println("You Chose Rock");
                System.out.println("Computer Chose Rock");
                System.out.println("Draw");

            } else if (playChoice == 2 && comChoice == 2) {
                System.out.println("You Chose Paper");
                System.out.println("Computer Chose Paper");
                System.out.println("Draw");

            } else if (playChoice == 3 && comChoice == 3) {
                System.out.println("You Chose Scissor");
                System.out.println("Computer Chose Scissor");
                System.out.println("Draw");

            } else if (playChoice == 1 && comChoice == 2) {
                System.out.println("You Chose Rock");
                System.out.println("Computer Chose Paper");
                System.out.println("You Lose!");
                comWins++;

            } else if (playChoice == 1 && comChoice == 3) {
                System.out.println("You Chose Rock");
                System.out.println("Computer Chose Scissor");
                System.out.println("You Lose!");
                comWins++;

            } else if (playChoice == 2 && comChoice == 1) {
                System.out.println("You Chose Paper");
                System.out.println("Computer Chose Rock");
                System.out.println("You Win!");
                playWins++;

            } else if (playChoice == 2 && comChoice == 3) {
                System.out.println("You Chose Paper");
                System.out.println("Computer Chose Scissor");
                System.out.println("You Lose!");
                comWins++;

            } else if (playChoice == 3 && comChoice == 1) {
                System.out.println("You Chose Scissor");
                System.out.println("Computer Chose Rock");
                System.out.println("You Lose!");
                comWins++;

            } else if (playChoice == 3 && comChoice == 2) {
                System.out.println("You Chose Scissor");
                System.out.println("Computer Chose Paper");
                System.out.println("You Win!");
                playWins++;
            }

            //scoreboard during the game
            System.out.println("Your Wins: " + playWins);
            System.out.println("Computer Wins: " + comWins);

            //quit or no
            System.out.println("Continue? Type exactly yes or no");
            playAgain = scanner.next();

            while (!(y).equals(playAgain) && (!(n).equals(playAgain))){
                System.out.println("Type exactly yes or no");
                playAgain = scanner.next();
            }

                if (playAgain.equals(n)){
                    //total score when player quits
                    System.out.println("Your Wins: " + playWins);
                    System.out.println("Computer Wins: " + comWins);
                quit = false;
            }




            }
        }
    }




