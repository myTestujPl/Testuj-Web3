package PracaDomowa.Wrappery;

import java.util.Scanner;

public class Cwiczenie1 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę. Zaokrąglę ją w dół");
        Scanner scanner = new Scanner(System.in);
        Double userNumber = scanner.nextDouble(); //przyjmuję od użytkownika typ double
        System.out.println("Zaokrąglona liczba: "+userNumber.intValue());
    }
}
