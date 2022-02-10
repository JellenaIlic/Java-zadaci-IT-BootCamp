package Petlje;

import java.util.Scanner;

//***15. Napraviti program koji izbacuje da li je broj pozitivan ili negativan.
public class pozitivnoIInegativno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi broj");
        int i = sc.nextInt();

        if (i < 0) {
            System.out.println("Broj je negativan");
        } else if (i == 0) {
            System.out.println("Broj je jednak nuli");
        } else {

            System.out.println("Broj je pozitivan");
        }
        System.out.println("**********");
    }
}