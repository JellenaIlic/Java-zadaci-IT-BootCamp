package Petlje;

import java.util.Scanner;

//***21.Napraviti program koji ce za uneti pozitivni broj ispisati faktorijel tog broja
//**Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1.
// Dakle, npr:
//5! = 5 * 4 * 3 * 2 * 1 = 120
//3! = 3 * 2 * 1 = 6
public class faktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Unesite pozitivan broj");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
    }}

