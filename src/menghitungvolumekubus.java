import java.util.Scanner;

public class menghitungvolumekubus {

    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        System.out.print("Masukan Volume kubus :");
        Double sisi = inputan.nextDouble();
        Double volume = sisi * sisi * sisi;

        System.out.println("Volume Kubus :" + volume);

        inputan.close();
    }
    
}
