package Petlje;
//*Napisati program koji obradjuje unete godine korisnika i
// izbacuje odgovor da li mogu da dobiju vozacku dozvolu.
// Koristiti Whilw Petlju.

import java.util.Scanner;

public class vozackaSkener {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite vase godine");
        int i= sc.nextInt();


        while (i <= 100) {
            if (i < 18) {
                System.out.println("Maloletni ste");
                break;
            }
            else if (i >=18 && i <= 65) {
                System.out.println("Mozete dobiti dozvolu");
                break;
            }
            else if (i < 100) {
                System.out.println("ne mozete, prestari ste");
                break;
            }


            System.out.println("******");
        }
    }
}
