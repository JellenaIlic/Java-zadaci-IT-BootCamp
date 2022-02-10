package Prodavnica;


public class Proizvod {
   private String NazivProizvoda;
   private double CenaProizvoda;
   private String OpisProizvoda;
   private int TezinaUGramima;

    public Proizvod(String nazivProizvoda, double cenaProizvoda, String opisProizvoda, int tezinaUGramima) {
        this.NazivProizvoda = nazivProizvoda;
        this.CenaProizvoda = cenaProizvoda;
        this.OpisProizvoda = opisProizvoda;
        this.TezinaUGramima = tezinaUGramima;
    }

    public Proizvod(String nazivProizvoda, double cenaProizvoda, int tezinaUGramima) {
        this.NazivProizvoda = nazivProizvoda;
        this.CenaProizvoda = cenaProizvoda;
        this.TezinaUGramima = tezinaUGramima;
    }

    public String getNazivProizvoda() {
        return NazivProizvoda;
    }

    public double getCenaProizvoda() {
        return CenaProizvoda;
    }

    public String getOpisProizvoda() {
        return OpisProizvoda;
    }

    public int getTezinaUGramima() {
        return TezinaUGramima;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.NazivProizvoda = nazivProizvoda;
    }

    public void setCenaProizvoda(double cenaProizvoda) {
        this.CenaProizvoda = cenaProizvoda;
    }

    public void setOpisProizvoda(String opisProizvoda) {
        this.OpisProizvoda = opisProizvoda;
    }

    public void setTezinaUGramima(int tezinaUGramima) {
        this.TezinaUGramima = tezinaUGramima;
    }



    public  String toString () {
        StringBuilder sb=new StringBuilder();
        sb.append("Naziv proizvoda " ) .append(NazivProizvoda).append("\n");
        sb.append("Cena proizvoda ") .append(CenaProizvoda) .append("\n");
        sb.append("Opis proizvoda ").append(OpisProizvoda).append("\n");
        sb.append("Tezina proizvoda ").append(TezinaUGramima).append("\n");
        return sb.toString();
    }
}
