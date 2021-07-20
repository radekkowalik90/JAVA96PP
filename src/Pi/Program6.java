package Pi;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        int liczba;
        double suma = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        liczba = input.nextInt();
        for (int i = 1; i<=liczba; i++)
            suma += (1.0/i);
        System.out.println("Suma szeregu harmonicznego od 1 do "+liczba+" wynosi: "+suma);
    }
}
