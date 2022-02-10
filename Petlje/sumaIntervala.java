package Petlje;
//***30.Suma intervala.Korisnik unosi cele brojeve m i n sa konzole,m<=n.
// Ispisati sumu brojeva (m,n).


import java.util.Scanner;

public class sumaIntervala {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ukucajte m broj");
        int m = sc.nextInt();

        System.out.println("Ukucajte n broj");
        int n = sc.nextInt();

        int suma = 0;
        for (int i = m; i <= n; i++) {
            suma = suma + i;

        }
        System.out.println(suma);
    }
}