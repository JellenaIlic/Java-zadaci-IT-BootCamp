package Petlje;

import java.util.Scanner;

//**10.Prikazati sumu brojeva do n.
public class sumaDoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesi broj n");
        int n= sc.nextInt();

        int suma=0;

        for( int i=0; i < n; i++) {
            suma=suma+i;

        }

        System.out.println("Suma brojeva do n je " + suma);
    }
}
