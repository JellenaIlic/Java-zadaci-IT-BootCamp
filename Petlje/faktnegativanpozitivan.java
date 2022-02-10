package Petlje;

import javax.swing.*;
import java.util.Scanner;
//**26. Napraviti program koji izracunava faktorijel i za uneti negativan ili pozitivan broj.
public class faktnegativanpozitivan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Unesi NEGATIVAN ili POZITIVAN broj");

        int n=sc.nextInt();

        int fact=1;

        if (n>=0) {
            for (int i = 1; i <=n; i++) {
                fact=fact*i;
                System.out.println(fact);
            } }
            else {
            for (int i = n; i <=-1 ; i++) {
                fact=fact*i;
                System.out.println(fact);

            }
        }

    }
}
