package numbergame;
import java.util.Scanner;

import java.util.Random;

public class NumberGame {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int chances=8;
        int finals=0;
        boolean playAgain = true;
        System.out.println("Enter your name");
        String name = scn.nextLine();
        System.out.println("Welcome"+" "+name);
        System.out.println("Hey " + name + " you have about "+chances +" chances to win the game");

        while(playAgain){
            int rand= getrandN(1,100);
            boolean guess = false;
            for(int i=0; i<chances; i++){
                System.out.println("Chance "+(i+1)+" Enter your guess:");
                int user = scn.nextInt();
                if(user == rand){
                    guess = true;
                    finals += 1;
                    System.out.println("You Won it.");
                    break;
                }
                else if(user > rand){
                    System.out.println("Too High");
                }
                else{
                    System.out.println("Too Low");
                }
            }

            if(guess == false){
                System.out.println("Sorry "+name+"."+"You lost the chances. The number is "+rand);
            }
            System.out.println("Do you want to play Again(y/n)");
            String pA = scn.next();
            playAgain = pA.equalsIgnoreCase("y");

        }
        System.out.println("That's it "+name+ ",Hope you enjoyed it");
        System.out.println("Here is your Score"+finals);
    }
    public static int getrandN(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}
