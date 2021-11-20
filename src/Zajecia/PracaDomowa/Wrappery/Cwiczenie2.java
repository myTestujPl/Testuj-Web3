package Zajecia.PracaDomowa.Wrappery;

import java.util.Scanner;

public class Cwiczenie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        String first = scanner.next();
        int firstNumber = Integer.parseInt(first);

        System.out.println("Podaj drugą liczbę");
        String second = scanner.next();
        int secondNumber = Integer.parseInt(second);

        System.out.println("Suma: "+(firstNumber+secondNumber));


    }
}
