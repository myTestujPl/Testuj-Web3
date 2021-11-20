package PracaDomowa.String;

import java.util.Scanner;

public class Cwiczenie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz tekst");
        String text = scanner.nextLine();

        System.out.println("Wpisz znak");
        char character = scanner.next().charAt(0);  //tego nie było na zajęciach. Możecie zapisać też w zmiennej typu String

        String response = text.indexOf(character)==-1?"nie":"tak";

        System.out.println("Czy znak jest w tekście? "+response);
    }
}
