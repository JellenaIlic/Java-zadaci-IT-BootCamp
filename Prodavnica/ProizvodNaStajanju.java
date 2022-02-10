package Prodavnica;

public class ProizvodNaStajanju {
    private Proizvod proizvod;
    private int kolicinaNaStajanju;

    public ProizvodNaStajanju(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public ProizvodNaStajanju(Proizvod proizvod, int kolicinaNaStajanju) {
        this.proizvod = proizvod;
        this.kolicinaNaStajanju = kolicinaNaStajanju;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public int getKolicinaNaStajanju() {
        return kolicinaNaStajanju;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public void setKolicinaNaStajanju(int kolicinaNaStajanju) {
        this.kolicinaNaStajanju = kolicinaNaStajanju;
    }

    public String toString () {
        StringBuilder sb=new StringBuilder();
        sb.append("Naziv proizvoda " ).append(proizvod.getNazivProizvoda()).append("\n");
        sb.append("Kolicina na stajanju ").append(kolicinaNaStajanju).append("\n");
        return sb.toString();
    }
}
