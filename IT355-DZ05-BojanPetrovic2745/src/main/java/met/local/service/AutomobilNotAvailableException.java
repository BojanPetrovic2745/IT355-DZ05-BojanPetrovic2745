package met.local.service;

import org.springframework.stereotype.Service;

@Service
public class AutomobilNotAvailableException extends RuntimeException {

    private String naziv;
    private String nazivModela;
    private Integer godiste;

    public AutomobilNotAvailableException(String naziv, String nazivModela, Integer godiste) {
        this.naziv = naziv;
        this.nazivModela = nazivModela;
        this.godiste = godiste;
    }

    public AutomobilNotAvailableException() {
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

}
