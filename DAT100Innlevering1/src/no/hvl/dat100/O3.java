package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

    public static int fakultet(int tall) {
        int temp = 1;
        for (int i = 1; i <= tall; i++) {
            temp *= i;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("skriv inn tall: ");
        int tall = scanner.nextInt();

        int fakkisNummer = fakultet(tall);

        System.out.printf("Fakulteten av tallet du skrev er: %d \n", fakkisNummer);
    }
}