package Petlje;
//***23.Korisnik unosi novac kojim raspolaze sa racuna i cenu nekog artikla.
// Na standardni izlaz ispisati koliko artikala korisnik moze da kupi.


import java.util.Scanner;

public class zadatak24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite novac kojim raspolazete");
        double novac= sc.nextDouble();

        System.out.println("Unesite cenu artikla");
        double cena= sc.nextDouble();

        int kolicina = 0;
        while (novac > cena) {
            novac=novac-cena;
                kolicina++;
            }
        System.out.println("Broj artikla koje mozete kupiti je " + kolicina);
        }


    }

