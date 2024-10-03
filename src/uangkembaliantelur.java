import java.util.Scanner;

public class uangkembaliantelur {
    public static void main(String[] args) {
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print ( "Masukan Jumlah Telur(kg) : ");
            Double KiloTelur = inputan.nextDouble();

            System.out.print( "Masukan Uang Yang Dibayarkan : "); 
            Double uangDibayar = inputan.nextDouble();

            Double HargaTelur = KiloTelur * 28000;
            Double Kembalian = uangDibayar - HargaTelur;
      
            System.out.println("Harga Telur Per Kilogram " + Kembalian);
        }




    }
    
    
}
