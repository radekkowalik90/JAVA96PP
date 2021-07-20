package ZadaniaH;

import java.util.Scanner;
    //UWAGA!!! dla niektórych danych pętla może działać w nieskończoność...
public class ZadanieLeki {
    //Treść zadania
    //Mamy 3 opakowania z lekami. L1 = 10 pastylek, L2 = 16 pastylek, L3 = 21 pastylek.
    //Kiedy skończą się wszystkie 3 opakowania
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L1;
        System.out.println("Podaj pojemność pierwszego pojemnika: ");
        L1 = input.nextInt();
        int L2;
        System.out.println("Podaj pojemność drugiego pojemnika: ");
        L2 = input.nextInt();
        int L3;
        System.out.println("Podaj pojemność trzeciego pojemnika: ");
        L3 = input.nextInt();
        int L1cap=L1;
        System.out.println("Podaj liczbę tabletek w pierwszym pojemniku: ");
        L1cap = input.nextInt();
        int L2cap=L2;
        System.out.println("Podaj liczbę tabletek w drugim pojemniku: ");
        L2cap = input.nextInt();
        int L3cap=L3;
        System.out.println("Podaj liczbę tabletek w trzecim pojemniku: ");
        L3cap = input.nextInt();

        int dniSuma=0;
        boolean koniec = false;

        do{
           if(L1cap==0 && L2cap==0 && L3cap==0){
               koniec=true;
               break;
           }
           if(L1cap==0) L1cap=L1;
           if(L2cap==0) L2cap=L2;
           if(L3cap==0) L3cap=L3;

           dniSuma ++;
           System.out.println("Dzień: "+dniSuma);

           L1cap--;
           System.out.print("L1: "+L1cap+" ");
           L2cap--;
           System.out.print("L2: "+L2cap+" ");
           L3cap--;
           System.out.print("L3: "+L3cap+" ");
           System.out.println();
        }while (!koniec);
        System.out.println();
        System.out.println("Wszystkie opakowania skończą się po: "+dniSuma+" dniach");
    }
}
