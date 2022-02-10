package Petlje;
//***27.Napraviti program koji izracunava dupli faktorijel.


import java.util.Scanner;

public class dupliFakt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();

        int fact=1;

        if (n % 2 == 0) {
            for (int i = n; i >=2 ; i-=2) {
            fact*=i;
            }
        } else
            for (int i = n; i >=1 ; i-=2) {
            fact*=i;
            }


        System.out.println(fact);
        }

    }

