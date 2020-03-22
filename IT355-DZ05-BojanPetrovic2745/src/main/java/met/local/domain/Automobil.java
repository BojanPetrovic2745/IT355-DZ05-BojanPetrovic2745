package met.local.domain;

public class Automobil {

    private String naziv;
    private String nazivModela;
    private Integer godiste;
    private Klasa klasa;

    public Automobil() {
    }

    public Automobil(String naziv, String nazivModela, Integer godiste, Klasa klasa) {
        this.naziv = naziv;
        this.nazivModela = nazivModela;
        this.godiste = godiste;
        this.klasa = klasa;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getNazivModela() {
        return nazivModela;
    }

    public void setNazivModela(String nazivModela) {
        this.nazivModela = nazivModela;
    }

    public Integer getGodiste() {
        return godiste;
    }

    public void setGodiste(Integer godiste) {
        this.godiste = godiste;
    }

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    

}
