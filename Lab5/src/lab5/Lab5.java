package lab5;
import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        Tabung obj1 = new Tabung();
        System.out.println("Radius Tabung = " + obj1.cekRadius() + " Tinggi Tabung = " + obj1.cekTinggi());
        System.out.println("Volume default tabung adalah : " + obj1.getTabungDefault());
        System.out.println("Volume tabung saat ini adalah : " + obj1.getVolume());
        System.out.println("Volume tabung r = 1 dan t = 5 adalah : " + obj1.getTabungInput(1,5));
        
        /*buatlah program di file terpisah untuk membuat object dari class Tabung tersebut – object
        pertama dengan radius 5 dan tinggi 10 dan yang lain dengan radius 7.5 dan tinggi 15.5.
        Tampilkan radius, tinggi, luas alas dan volume tabung*/
        
        //Cara 1 (Set Radius & Tinggi)
        System.out.println("----------------CARA 1-------------------");
        obj1.setRadius(5);
        obj1.setTinggi(10);
        System.out.println("Setelah diubah menjadi r = " + obj1.cekRadius() + " dan t = " + obj1.cekTinggi());
        System.out.println("Volume tabung saat ini adalah : " + obj1.getVolume());
        obj1.setRadius(7.5);
        obj1.setTinggi(15.5);
        System.out.println("Setelah diubah menjadi r = " + obj1.cekRadius() + " dan t = " + obj1.cekTinggi());
        System.out.println("Volume tabung saat ini adalah : " + obj1.getVolume());
        
        //Cara 2 getTabungInput()
        System.out.println("----------------CARA 2-------------------");
        System.out.println("Volume tabung r = 5     , t = 10    : " + obj1.getTabungInput(5,10));
        System.out.println("Volume tabung r = 7.5   , t = 15.5  : " + obj1.getTabungInput(7.5,15.5));
    }   
}
