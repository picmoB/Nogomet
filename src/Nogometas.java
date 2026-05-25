public class Nogometas extends Sportas implements Comparable<Nogometas> {
    private int brojGolova;
//    int brojGolova;

    public Nogometas(String ime, int brojDresa, int brojGolova) {
        super(ime, brojDresa);
        this.brojGolova = brojGolova;
    }

    @Override
    public int compareTo(Nogometas o) {
        return Double.valueOf(brojGolova).compareTo(Double.valueOf(o.brojGolova));
    }

    @Override
    public String toString() {
        return "\nSportas - " + "ime: " + getIme() + "\n broj dresa: " + getBrojDresa() + "\n broj golova: " + brojGolova;
    }
}
