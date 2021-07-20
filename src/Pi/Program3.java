package Pi;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        //Napisz program służący do rozwiązywania równania kwadratowego. Program powinien pobrać trzy liczby całkowite (współczynniki równania kwadratowego a, b, c) i wyliczyć pierwiastki x1, x2 równania
        //wzor.
        //Jeśli delta ∆ wyjdzie ujemna, wypisz „Delta ujemna” i zakończ program.
        double x1;
        double x2;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        int a = input.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = input.nextInt();
        System.out.println("Podaj liczbę c: ");
        int c = input.nextInt();
        double delta = (b*b) - 4*(a*c);
        System.out.println("Delta wynosi: " + delta);
        if(delta < 0){
            System.out.println("Delta ujemna");
        }else if (delta == 0){
            x1 = -b/(2*a);
            System.out.println(x1);
            } else {
            System.out.println("Delta wynosi: " + delta);
            x1 = (-b-Math.sqrt(delta))/2*a;
            System.out.println("x1 = : " + x1);
            x2 = (-b+Math.sqrt(delta))/2*a;
        System.out.println("x2 = : " + x2);
        }
    }
}
