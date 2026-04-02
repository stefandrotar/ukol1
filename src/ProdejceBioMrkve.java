import java.time.LocalDate;

public class ProdejceBioMrkve {

    private String nazevProdejce;
    private LocalDate datumNarozeniProdejce;
    private int pocetSjednanychsmluv;
    private double mnozstviProdaneMrkveTuny;
    private boolean jeSeniornyProdejce;

    public ProdejceBioMrkve(String nazevProdejce, LocalDate datumNarozeniProdejce, int pocetSjednanychsmluv, double mnozstviProdaneMrkveTuny, boolean jeSeniornyProdejce) {
        this.nazevProdejce = nazevProdejce;
        this.datumNarozeniProdejce = datumNarozeniProdejce;
        this.pocetSjednanychsmluv = pocetSjednanychsmluv;
        this.mnozstviProdaneMrkveTuny = mnozstviProdaneMrkveTuny;
        this.jeSeniornyProdejce = jeSeniornyProdejce;
    }

    public String getNazevProdejce() {
        return nazevProdejce;
    }

    public void setNazevProdejce(String nazevProdejce) {
        this.nazevProdejce = nazevProdejce;
    }

    public LocalDate getDatumNarozeniProdejce() {
        return datumNarozeniProdejce;
    }

    public void setDatumNarozeniProdejce(LocalDate datumNarozeniProdejce) {
        this.datumNarozeniProdejce = datumNarozeniProdejce;
    }

    public int getPocetSjednanychsmluv() {
        return pocetSjednanychsmluv;
    }

    public void setPocetSjednanychsmluv(int pocetSjednanychsmluv) {
        this.pocetSjednanychsmluv = pocetSjednanychsmluv;
    }

    public double getMnozstviProdaneMrkveTuny() {
        return mnozstviProdaneMrkveTuny;
    }

    public void setMnozstviProdaneMrkveTuny(double mnozstviProdaneMrkveTuny) {
        this.mnozstviProdaneMrkveTuny = mnozstviProdaneMrkveTuny;
    }

    public boolean isJeSeniornyProdejce() {
        return jeSeniornyProdejce;
    }

    public void setJeSeniornyProdejce(boolean jeSeniornyProdejce) {
        this.jeSeniornyProdejce = jeSeniornyProdejce;
    }
}
