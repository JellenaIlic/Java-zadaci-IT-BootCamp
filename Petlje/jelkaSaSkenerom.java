package Petlje;

import java.util.Scanner;


import java.util.Scanner;
public class jelkaSaSkenerom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj");
        String razmak = " ";
        String z = "*";
        int n = sc.nextInt();

        for (int i = n; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(razmak);
            }
            System.out.println(z);
            z = z + "**";

        }
    }
}
