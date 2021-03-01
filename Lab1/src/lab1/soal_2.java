package lab1;

public class soal_2 {
    public void soaldua(){
        int dayafter = 1000 % 7;
        System.out.print("1000 hari setelah senin adalah : ");
        switch (dayafter) {
            case 0:
                System.out.println("Senin");
                break;
            case 1:
                System.out.println("Selasa");
                break;
            case 2:
                System.out.println("Rabu");
                break;
            case 3:
                System.out.println("Kamis");
                break;
            case 4:
                System.out.println("Jumat");
                break;
            case 5:
                System.out.println("Sabtu");
                break;
            case 6:
                System.out.println("Minggu");
                break;
            default:
                break;
        }
        
    }
}
