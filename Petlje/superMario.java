package Petlje;
///**29. Napraviti super mario kulu -.-


import java.util.Scanner;

public class superMario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int h=sc.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (j<=i) {

                    System.out.println("#");
                } else
                    System.out.println(" ");

            }
            System.out.println(".........");
        }
    }
}
