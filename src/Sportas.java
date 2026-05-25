public abstract class Sportas {
    private String ime;
    private int brojDresa;

    public Sportas(String ime, int brojDresa) {
        this.ime = ime;
        this.brojDresa = brojDresa;
    }

    public String getIme() {
        return ime;
    }

    public int getBrojDresa() {
        return brojDresa;
    }
}
