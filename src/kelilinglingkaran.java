import java.util.Scanner; 

public class kelilinglingkaran {

    public static void main(String[] args){

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Keliling Lingkaran :");
        Double jarijari = inputan.nextDouble();
        Double keliling = 2 * Math.PI * jarijari;

        System.out.print("Keliling Lingkaran :"+ keliling);

        inputan.close();
    }
    
}
