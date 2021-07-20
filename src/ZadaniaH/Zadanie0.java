package ZadaniaH;

import java.util.Scanner;

public class Zadanie0 {
    //Wyświetlenie podzielników (całkowitych) liczby X
    //Suma podzielników liczby X
    //Czy liczba jest doskonała (suma podzielników równa liczbie, np. 6 = 1 + 2 + 3)
    //Szukamy liczby powyżej X która jest doskonała.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = input.nextInt();
        boolean koniec = false;
        do {
            int suma = 0;
            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    suma += i;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("Suma dzielników wynosi: " + suma);
            if (suma == x) {
                System.out.println("Liczba jest doskonała: " + suma + " = " + x);
                koniec = true;
            } else {
                System.out.println("Liczba nie jest doskonała");
            }
            x++;
        }while (!koniec);
    }
}
