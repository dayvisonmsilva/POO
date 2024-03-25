package Reuso_de_Classes.Q38;

public class Equipamento {
    private String numSerie;
    private String marca;

    public Equipamento(String numSerie, String marca) {
        this.numSerie = numSerie;
        this.marca = marca;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "NumSerie=" + numSerie + " | marca=" + marca;
    }
}
