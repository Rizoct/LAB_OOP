package lab5_2;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Lab5_2 {
    public static void main(String[] args){
        //GregorianCalendar tanggal sekarang
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println(gcal.getTime());
        System.out.println("----------------------------"); 
        

        Calendar calndr = Calendar.getInstance();
        SimpleDateFormat format_date = new SimpleDateFormat("yyyy-MM-dd"); 
        
        //Tanggal Sekarang
        String tanggal_1 = format_date.format(gcal.getTime()); 
        System.out.println("Tanggal hari ini: " + tanggal_1); 
        
        //Tanggal default 1970-1-1
        gcal.setTimeInMillis(0);  
        String tanggal_2 = format_date.format(gcal.getTime()); 
        System.out.println("Tanggal sistem Calender: " + tanggal_2); 
        //Membandingkan
        long Daybetween = ChronoUnit.DAYS.between(LocalDate.parse(tanggal_2),LocalDate.parse(tanggal_1)); 
        long month = ChronoUnit.MONTHS.between(LocalDate.parse(tanggal_2),LocalDate.parse(tanggal_1)); 
        long year = ChronoUnit.YEARS.between(LocalDate.parse(tanggal_2),LocalDate.parse(tanggal_1)); 
        System.out.println(String.format("Jumlah Waktu yang sudah berlalu Hingga saat ini adalah " + year + " Tahun " + month + " bulan " + Daybetween + " Hari "));
    }
}
