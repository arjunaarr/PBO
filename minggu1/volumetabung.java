package week1;
public class volumetabung {
    public static void main(String[] args) {
        // Deklarasi variabel untuk diameter dan tinggi tabung
        double diameter = 5.0;
        double tinggi = 10.0;
        
        // Menghitung jari-jari
        double jariJari = diameter / 2;
        
        // Menghitung volume tabung
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        
        // Menampilkan hasil volume tabung
        System.out.println("Volume tabung dengan diameter " + diameter + " dan tinggi " + tinggi + " adalah: " + volume);
    }
}
