package PracaDomowa.Operatory;

import java.util.Scanner;

public class Cwiczenie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("True or false?");
        boolean response = scanner.nextBoolean();

        System.out.println("hahaha! No! It's "+!response);
    }
}
