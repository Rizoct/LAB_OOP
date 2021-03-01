package lab1;
import java.util.*;

public class soal_1 {
    public void soalsatu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        int seconds_input = input.nextInt();
        int minutes = seconds_input / 60;
        int seconds = seconds_input % 60;
        if(seconds == 0) {
            System.out.println(seconds_input + " seconds is " + minutes + " minutes");
        } else {
            System.out.println(seconds_input + " seconds is " + minutes + " minutes and " + seconds + " seconds");
        }
    }
}
