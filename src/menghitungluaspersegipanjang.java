import java.util.Scanner;

public class menghitungluaspersegipanjang {
    public static void main(String[] args){

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan luas persegi panjang :");
        Double panjang = inputan.nextDouble();
        System.out.print("Masukkan luas persegi panjang :");
        Double lebar = inputan.nextDouble();
        Double luas = (panjang * lebar);
        
        System.out.println("Luas persegi panjang :" + luas );

        inputan.close();
    }
    
}
