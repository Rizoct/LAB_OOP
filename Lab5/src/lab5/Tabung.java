package lab5;

public class Tabung {
    private double radius = 1;
    private double tinggi = 1;
    
    Tabung() {}
    
    //Set & Cek radius & tinggi
    public void setDefault(){
        radius = 1;
        tinggi = 1;
    }
    public void setRadius(double r){
        radius = r;
    }
    public void setTinggi(double t){
        tinggi = t;
    }
    public double cekRadius(){
        return radius;
    }
    public double cekTinggi(){
        return tinggi;
    }
    
    //Volume default & input
    public double getTabungDefault(){
        return Math.PI * radius * radius * tinggi;
    }
    public double getTabungInput(double r, double t){
        return Math.PI * r * r * t;
    }
    
    // get volume & luas alas
    public double getVolume(){
        return Math.PI * radius * radius * tinggi;
    }
    
    public double getLuasAlas(){
        return 2 * Math.PI * radius * (radius + tinggi);
    } 
}

