package Klase.BankovniRacun;

public class Osoba {
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private double visina;


    public String getIme() {
        return ime; }

    public String getPrezime() {
        return prezime; }

    public int getGodinaRodjenja() {
        return godinaRodjenja; }

    public double getVisina() {
        return visina;}

    public void setIme(String ime) {
        this.ime = ime;}

    public void setPrezime(String prezime) {
        this.prezime = prezime;}

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;}

    public void setVisina(double visina) {
        this.visina = visina;}

    public Osoba(String ime, String prezime, int godinaRodjenja, double visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.visina = visina;
    }

//ovo iznad mu zapravo dodje konskturkto kad ide na automatsko dodavanje plus treba ispisi
        // this.ime=ime; itd
        //**  ime=ime1;
       // ** prezime=prezime1;
       //** godinaRodjenja=godinaRodjenja1;
       //** visina=visina1;
        //**konstruktor


    public String toString () {
       //** String stringKojiVracam;
       //** stringKojiVracam = "Ime je " + ime + "\n";
       //** stringKojiVracam += "Prezime je " + prezime + "\n";
       //** stringKojiVracam += "Godina rodjenja je " + godinaRodjenja + "\n";
        //** stringKojiVracam += "Visina je " + visina + "\n";
      //**  return stringKojiVracam;

        StringBuilder sb=new StringBuilder();
        sb.append ("Ime je " + ime + "\n");
        sb.append("Prezime je " + prezime + "\n");
        sb.append ("Godina rodjenja je " + godinaRodjenja + "\n");
        sb.append ("Visina je " + visina + "\n");
        return  sb.toString();
    }


}
