package Petlje;
//**Napisati program koji obradjuje unete godine korisnika i
//** izbacuje odgovor da li mogu da dobiju vozacku dozvolu. Koristiti While Petlju.

public class vozackaDozvola {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {
            if (i < 18) {
                System.out.println("Imate " + i + " godina. Maloletnim licima ne izdajemo vozacke dozvole.");
            } else if (i >= 18 && i < 65) {
                System.out.println("Imate " + i + " godina. Mozete imati vozacku dozvolu.");
            } else if (i < 100) {
                System.out.println("Imate " + i + " godina. Ne mozete vise imati vozacku dozvolu.");
            }
            i++;
        }

        System.out.println("Kraj programa");
        }
    }

