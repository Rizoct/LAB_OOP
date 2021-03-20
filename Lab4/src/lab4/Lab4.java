package lab4;
import java.util.*;
public class Lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan String 1 : ");
        String a = input.nextLine();
        System.out.print("Masukkan String 2 : ");
        String b = input.nextLine();
        if(a.compareTo(b) > 0){
            System.out.println(b + "\n" + a);
        }else if(a.compareTo(b) < 0){
            System.out.println(a + "\n" + b);
        }
    }    
}
