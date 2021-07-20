package Pi;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float waga;
        int wzrost;
        System.out.println("Podaj wagę w kg: ");
        waga = scanner.nextFloat();
        System.out.println("Podaj wzrost w cm");
        wzrost = scanner.nextInt();
        double wzrost2 = Math.pow(wzrost, 2)/10_000;
        double BMI = waga/wzrost2;
        System.out.println("Twoje BMI wynosi: " + BMI);
        if (BMI <= 18.5 || BMI >= 24.9){
            System.out.println("Nieprawidłowe BMI");
        }else{
            System.out.println("Prawidłowe BMI");
        }
    }
}
