package lab6;
import java.util.*;

public class Lab6 {

    public static void main(String[] args) {
        char[] kunciJawaban = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] hasilJawaban = {0, 0, 0, 0, 0, 0, 0, 0};
        int countJawabanBenar = 0;
        char[][] jawabanMahasiswa = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, 
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        for(int i = 0; i < 8; i++){
            countJawabanBenar = 0;
            for(int j = 0; j < 10; j++){
                if(jawabanMahasiswa[i][j] == kunciJawaban[j]){
                    countJawabanBenar++;
                }
            }
            System.out.println("Mhs " + i + " jumlah jawaban benar adalah " + countJawabanBenar);
            
        }
       
    }
    
}
