package model;

public class HiWi implements StudHilfskraft {
    private String name;
    private double gehalt;
    private int matrNr;
    private int dauer;

    @Override
    public double getGehalt() {
        return gehalt;
    }

    @Override
    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMatrNr() {
        return matrNr;
    }

    @Override
    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }

    @Override
    public int getDauer() {
        return dauer;
    }

    @Override
    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    public HiWi() {

    }

    public HiWi(String name) {
        this();
        this.name = name;
    }

    public HiWi(String name, int matrNr) {
        this(name);
        this.matrNr = matrNr;
    }

    public HiWi(String name, int matrNr, double gehalt) {
        this(name, matrNr);
        this.gehalt = gehalt;
    }

    public HiWi(String name, int matrNr, double gehalt, int dauer) {
        this(name, matrNr, gehalt);
        this.dauer = dauer;
    }

    @Override
    public String toString() {
        return "HiWi [name=" + name + ", gehalt=" + gehalt + ", matrNr=" + matrNr + ", dauer=" + dauer + "]";
    }

}
