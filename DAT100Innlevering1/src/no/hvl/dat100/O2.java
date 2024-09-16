package no.hvl.dat100;
import java.util.Scanner;

public class O2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int poengsum;

            do {
                System.out.println("Skriv din poengsum her (0-100): ");
                poengsum = scanner.nextInt();

                if (poengsum < 0 || poengsum > 100) {
                    System.out.println("Ugyldig poengsum. Poengsum må være mellom 0 og 100.");
                }
            } while (poengsum < 0 || poengsum > 100);  

            String karakter;

            if (poengsum >= 90) {
                karakter = "A";
            } else if (poengsum >= 80) {
                karakter = "B";
            } else if (poengsum >= 60) {
                karakter = "C";
            } else if (poengsum >= 50) {
                karakter = "D";
            } else if (poengsum >= 40) {
                karakter = "E";
            } else {
                karakter = "F";
            }

            System.out.println("Karakter: " + karakter);
        }
    }
}