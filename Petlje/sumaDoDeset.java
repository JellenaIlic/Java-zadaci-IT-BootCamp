package Petlje;
//**9. Prikazati sumu brojeva od 1 do 10.


public class sumaDoDeset {
    public static void main(String[] args) {

        System.out.println("Prikazi brojeve do 10");

        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            suma = suma + i;

        }
        System.out.println(suma);
    }

}
