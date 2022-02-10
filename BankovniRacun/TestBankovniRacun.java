package Klase.BankovniRacun;

//Napisati test program (main metodu) za klasu BankovniRacun.
// Potrebno je napraviti 2 osobe, i napraviti 2 bankovna racuna za te osobe.
// I izvrsiti neke uplate i podizanja novca.
// Nakon svake uplate i podizanja novca ispisati taj bankovni racun.
public class TestBankovniRacun {
    public static void main(String[] args) {

        Osoba korisnik1=new Osoba("Jelena", "Ilic", 1995, 165.4);
        Osoba korisnik2= new Osoba("Olgica", "Ilic", 1962, 172.1);

        BankovniRacun racun1=new BankovniRacun(korisnik1, 3000);
        BankovniRacun racun2=new BankovniRacun(korisnik2, 5000);

        racun1.uplata(1400);
        System.out.println(racun1);


        racun2.isplata(5200);
        System.out.println(racun2);

    }
}
