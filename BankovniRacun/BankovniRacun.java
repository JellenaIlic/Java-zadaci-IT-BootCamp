package Klase.BankovniRacun;

//**Implementirati Java klasu BankovniRacun s atributima osoba(mozete da koristite onu do sada,
// mozete da pravite/pisete ponovo) i stanje na racunu (double vrednost koja predstavlja koliko
//ima novca na racunu), kao i metodama
//2 konstruktor metode, jedna prima samo osobu i stanje postavlja na 0,
// druga prima osobu i stanje
//Getter i setter
//toString (koristeci StringBuilder, ispisati informacije o osobi koja je vlasnik racuna
// i ispisati koliko je stanje na racunu
//za uplatu i isplatu proizvoljnog iznosa (ako korisnik pokusa da podigne
// vise nego sto se trenutno nalazi na racunu, ne dozvoliti korisniku da podigne novac i ispisati poruku o gresci)
//
//Napisati test program (main metodu) za klasu BankovniRacun.
// Potrebno je napraviti 2 osobe, i napraviti 2 bankovna racuna za te osobe. I izvrsiti neke uplate i podizanja novca.
// Nakon svake uplate i podizanja novca ispisati taj bankovni racun.
public class BankovniRacun {
    private Osoba vlasnikRacuna;
    private double stanjeNaRacunu;

    public BankovniRacun(Osoba vlasnikRacuna, double stanjeNaRacunu) {
        this.vlasnikRacuna = vlasnikRacuna;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public BankovniRacun(Osoba vlasnikRacuna) {
        this.vlasnikRacuna = vlasnikRacuna;
    }

    public Osoba getVlasnikRacuna() {
        return vlasnikRacuna;
    }

    public void setVlasnikRacuna(Osoba vlasnikRacuna) {
        this.vlasnikRacuna = vlasnikRacuna;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String toString () {
        StringBuilder sb =new StringBuilder();
        sb.append("Ime vlasnika je ") .append(vlasnikRacuna.getIme()).append("\n");
        sb.append("Prezime vlasnika je ").append(vlasnikRacuna.getPrezime()).append("\n");
        sb.append("Stanje na racunu je ").append(stanjeNaRacunu).append("\n");

        return sb.toString();
    }

    public double uplata (double iznos) {
        stanjeNaRacunu = stanjeNaRacunu + iznos;
        return stanjeNaRacunu;
    }
    public double isplata(double iznos) {
        if (iznos > stanjeNaRacunu) {
            System.out.println("Greska. Iznos koji ste uneli je veci od stanja na racunu");
        }
        else  {
            stanjeNaRacunu=stanjeNaRacunu - iznos;
        }
        return stanjeNaRacunu;
    }

}
