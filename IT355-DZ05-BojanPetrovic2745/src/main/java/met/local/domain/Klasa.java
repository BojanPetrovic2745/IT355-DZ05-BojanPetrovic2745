package met.local.domain;

public class Klasa {

    private int id;
    private String klasa;

    public Klasa() {
    }

    public Klasa(int id, String klasa) {
        this.id = id;
        this.klasa = klasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "Klasa{" + "id=" + id + ", klasa=" + klasa + '}';
    }

}
