package lab1;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        do{
        System.out.print("Pilih soal 1 atau 2 : ");
        pilih = input.nextInt();
        }while(pilih < 0 || pilih > 2);
        
        if(pilih == 1){
            soal_1 soal_1 = new soal_1();
            soal_1.soalsatu();
        }else if(pilih == 2){
            soal_2 soal_2 = new soal_2();
            soal_2.soaldua();
        }
    } 
}
