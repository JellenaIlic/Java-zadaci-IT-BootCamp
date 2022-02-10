package Petlje;

import java.util.Scanner;

//***21.24.Za unet negativan ceo broj n,ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
public class zadatak244 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite broj");
        int n= sc.nextInt();

        for (int i = n; i <=0 ; i++) {
            System.out.println(i);
        }

        System.out.println("***");
    }


}
