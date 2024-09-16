package no.hvl.dat100;

import java.util.Scanner;

public class O1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oppgi inntekt: ");
        double inntekt = scanner.nextDouble();

        double trinnskatt = beregnTrinnskatt(inntekt);

        System.out.printf("Trinnskatt å betale: %.2f%n", trinnskatt);
    }

    public static double beregnTrinnskatt(double inntekt) {
        if (inntekt > 1350000) {
            return inntekt * 0.176;
        } else if (inntekt > 937900) {
            return inntekt * 0.166;
        } else if (inntekt > 670000) {
            return inntekt * 0.136;
        } else if (inntekt > 292850) {
            return inntekt * 0.04;
        } else if (inntekt > 208050) {
            return inntekt * 0.017;
        } else {
            return 0.0;
        }
    }
}