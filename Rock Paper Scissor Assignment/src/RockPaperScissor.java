import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Random random = new Random ();

        String r = "rock";
        String s = "scissor";
        String p = "paper";

        String [] plays = {r, p, s};

        boolean quit = false;

        String ComChoice;
        String PlayChoice;

        int index;

        while(!quit){
            System.out.println("PickRock, Paper, Scissor");
            PlayChoice = scanner.nextline();

            index = random.nextInt(3);
            ComChoice = plays[index];

            System.out.println("Player choice:" + PlayChoice +" Computer Choice:" + ComChoice);

            if(PlayChoice. equals(ComChoice)){
                System.out.println("Draw");

            }else if (PlayChoice.equals(r) && ComChoice.equals(p));{

                System.out.println("Computer Wins");

            } else if (PlayChoice.equals(r) && ComChoice.equals(s));{

                System.out.println("You Win");

            } if(PlayChoice.equals(p) && ComChoice.equals(r));{

                System.out.println("You Win");

            } if(PlayChoice.equals(r) && ComChoice.equals(p));{

                    System.out.println("Computer Wins");

                } if (PlayChoice.equals(s) && ComChoice.equals(r));{


                        System.out.println("Computer Wins");

                    }if (PlayChoice.equals(s) && ComChoice.equals(p));{

                        System.out.println("You Win");



                }}}}


