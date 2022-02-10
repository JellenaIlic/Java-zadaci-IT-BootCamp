package Petlje;
//**Prikazati sumu parnih brojeva do n.

import java.util.Scanner;

public class sumaParnih {
    public static void main(String[] args) {

        System.out.println("Unesi n broj");
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int suma=0;

        for (int i=0; i <= n; i++) {
            if (i %2 == 0)
                suma=suma+i;
        }
        System.out.println("Suma parnih brojeva do " + n + " je " + suma);

    }
}
