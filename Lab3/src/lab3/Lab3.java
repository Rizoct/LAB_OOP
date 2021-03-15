package lab3;
import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_user = 0;
        Random rand = new Random();
        int guess = rand.nextInt(100);
        System.out.println("Guess a magic number between 0 and 100 ");
        do{
            System.out.print("Enter your guess : ");
            input_user = input.nextInt();
            if(input_user > guess){
                System.out.println("Your guess is too high");
            }else if(input_user < guess){
                System.out.println("Your guess is too low");
            }else if(input_user == guess){
                System.out.println("Yes, the number is " + guess);
            }
        }while(input_user != guess);
    }
    
}
