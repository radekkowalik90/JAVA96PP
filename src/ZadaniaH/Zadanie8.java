package ZadaniaH;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {

        float a;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        a = input.nextFloat();
        float b;
        System.out.println("Podaj drugą liczbę: ");
        b = input.nextFloat();
        String znak;
        System.out.println("Podaj znak działania: ");
        znak = input.next();
        double wynik;
        switch (znak) {
            case "+": {
                wynik = a + b;
                System.out.println("Suma: "+wynik);
                break;
            }
            case "-": {
                wynik = a - b;
                System.out.println("Różnica: "+wynik);
                break;
            }
            case "*": {
                wynik = a * b;
                System.out.println("Iloczyn: "+wynik);
                break;
            }
            case "/": {
                wynik = a / b;
                System.out.println("Iloraz: "+wynik);
                break;
            }
            case "%": {
                wynik = a % b;
                System.out.println("Modulo: "+wynik);
                break;
            }
            default: {
                System.out.println("Zły znak");
            }
        }
    }
}
