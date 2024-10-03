import java.util.Scanner;

public class konfersisuhucelciuskefahrenhit {
    public static void main(String[] args){

    Scanner inputan = new Scanner(System.in);
    System.out.print("Masukan suhu dalam celcius : ");
    Double celcius = inputan.nextDouble();
    Double fahrenheit = (celcius * 9/5) + 32;

    System.out.println("Suhu dalam Fahrenheit :" + fahrenheit);

    inputan.close();

    }

}