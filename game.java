import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args){
        Random computer = new Random();
        int computerrandom = computer.nextInt(100);
        int tryCount = 0;
        while (true) {
            System.out.println("enter the number whose limit is 1 to 100");
            Scanner a = new Scanner(System.in);
            int b = a.nextInt();
            tryCount++;
            if (computerrandom == b)
            {
                System.out.println("you Guessing number is correct ");
                System.out.println("you win the game in " +tryCount+"tries" );
                break;
            }
            else if (computerrandom > b)
            {
                System.out.println("your guessing number is too lower \n");
            }
            else
            {
                System.out.println("your guessing number is too higher \n");
            }
        }
    }
}