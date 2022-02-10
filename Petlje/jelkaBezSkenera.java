package Petlje;
//*19.Nacrtaj jelku bez skenera

public class jelkaBezSkenera {
    public static void main(String[] args) {

        String razmak = " ";
        String z = "*";

        for (int i = 5; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(razmak);
            }
            System.out.println(z);
            z = z + "**";
        }
    }
}
