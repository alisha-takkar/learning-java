/*
    ->The user has to guess a number between 1 and 10 only. If they guess higher, let them reguess without subtracting the score
    ->The user should have only 5 guesses. 
    ->Once the user has guessed the right number, print "Congratulations! you got it!" and end the game
    ->If the user gets it wrong, subtract the total number of guesses by 1
    ->Once the user uses up all their guesses, print "Too bad! You used all your guesses up" and end the game
 */

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        System.out.println("Guess a number between 1 to 10 ");
        Scanner input = new Scanner(System.in);
        int guesses = 4;
        int max=11 , min=1;
        int a = (int)Math.random() * (max-min+1) +min;
        int in;
        while((in =input.nextInt()) >10 ){
            System.out.println("Whoops! Guess again ");
        }
        
        if(in>=1 && in<=10){
       while (guesses > 0) {
            if (in == a){
                System.out.println("Congratulation! You got it! ");
                System.exit(0);
            }
            else{
                System.out.println(" Guess again ");
                int in1 = input.nextInt();
                guesses-- ;
                if(guesses == 0)
                {
                    System.out.println("Too bad! You used all your guesses up");
                    System.exit(0);
                }
            }

        }
    }
}
}