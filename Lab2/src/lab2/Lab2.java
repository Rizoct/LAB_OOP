package lab2;
import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int lotere = rand.nextInt(3) + 10;
        String str_lotere = String.valueOf(lotere);
        if(lotere < 10){
            str_lotere = "0" + str_lotere;
        }
        int hadiah = 0;
        System.out.print("input nomor lotere anda : ");
        String str_lotere_user;
        int lotere_user = input.nextInt();
        if(lotere_user < 10){
            str_lotere_user = "0" + lotere_user;
        }else{
            str_lotere_user = String.valueOf(lotere_user);
        }
        System.out.println("Nomor lotere anda adalah : " + str_lotere_user);
        char lotere_digit1 = str_lotere.charAt(0);
        char lotere_digit2 = str_lotere.charAt(1);
        char input_digit1 = str_lotere_user.charAt(0);
        char input_digit2 = str_lotere_user.charAt(1); 
        System.out.println("Nomor lotere menang adalah : " + lotere);
        //System.out.println(lotere_digit1);
        //System.out.println(lotere_digit2);
        //System.out.println("----------");
        //System.out.println(input_digit1);
        //System.out.println(input_digit2);
        if(str_lotere_user.equals(str_lotere)){
            hadiah += 10000;
        }else if(lotere_digit1 == input_digit1){
            hadiah += 1000;  
        }else if(lotere_digit1 == input_digit2 && lotere_digit2 != input_digit1){
            hadiah += 1000;
        }else if(lotere_digit2 == input_digit1 && lotere_digit1 != input_digit2){
            hadiah += 1000;
        }else if(lotere_digit2 == input_digit2 && lotere_digit2 != input_digit1){
            hadiah += 1000;
        }else if(lotere_digit2 == input_digit1 && lotere_digit1 == input_digit2){
            hadiah += 3000;
        }
        System.out.println("Hadiah anda adalah : " + hadiah);
    }
}
