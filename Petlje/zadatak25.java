package Petlje;
//**25. Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
// koji je strogo manji od njega (dakle t < n),
// sumu svih pozitivnih celih brojeva od 1 do tog broja, broja t.
// PASTEBIN 10

import java.util.Scanner;

public class zadatak25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int t = 1; t <= n; t++) {
            int sum = 0;
            for (int i = 1; i <= t; i++) {
                sum += i;
            }
            System.out.println("Suma od 1 do " + t + " je: " + sum);


        }
    }}
