package Pi;

import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wpisz liczbe: ");
        int zakres = scanner.nextInt();
        boolean jest;
        for (int i = 2; i < zakres; i++) {
            jest = true;
            if (i == 2) {
                System.out.println(2);
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        jest = false;
                        break;
                    }
                }
                if (jest == true)
                    System.out.println(i);
            }
        }
    }
}
