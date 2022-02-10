package Petlje;
//*****22.Na standardni ulaz korisnik treba da unese dva cela broja.
// Na standardni izlaz u zasebnim redovima treba napisati zbir,
// razliku,proizvod,kolicnik i ostatak deljenja prvog broja drugim tim redom.

import java.util.Scanner;

public class aritmetickeOperacije {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Unesite prvi broj");
        int a= sc.nextInt();

        System.out.println("Unesite drugi broj");
        int b= sc.nextInt();

        int zbir= a + b;
        int razlika = a-b;
        int mnozenje = a*b;
        int kolicnik = a/b;
        int ostatak= a % b;

        System.out.println("Zbir a i b je " + zbir);
        System.out.println("Razlika a i b " + razlika);
        System.out.println("Proivod a i b " + mnozenje);

        if (ostatak==0) {
        System.out.println("Kolicnik a i b " + kolicnik);
    } else {
        System.out.println("Kolicnik a i b iznosi " + kolicnik + " a ostatak pri deljenju je " + ostatak);
    }

}

    }
