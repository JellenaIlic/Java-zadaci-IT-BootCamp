package Prodavnica;

import Klase.BankovniRacun.Osoba;

import java.util.ArrayList;

public class Racun {

    private ArrayList<Proizvod>NizKupljenihproizvoda;
    private String datum;
    private Osoba kupac;
    private Osoba prodavac;
    private double iznos;

    public Racun(ArrayList<Proizvod> nizKupljenihproizvoda, String datum, Osoba kupac, Osoba prodavac) {
        this.NizKupljenihproizvoda = nizKupljenihproizvoda;
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this. iznos = 0;
    }

        public Racun(ArrayList<Proizvod> nizKupljenihproizvoda, String datum, Osoba kupac, Osoba prodavac, double iznos) {
        NizKupljenihproizvoda = nizKupljenihproizvoda;
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.iznos = iznos;
    }
}

