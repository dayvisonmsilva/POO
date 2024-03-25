package Reuso_de_Classes.Q38;

public class Computador extends Equipamento {
    private String sistemaOperacional;
    private String processador;

    public Computador(String numSerie, String marca, String sistemaOperacional, String processador) {
        super(numSerie, marca);
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return super.toString() + " | SistemaOperacional=" + sistemaOperacional + " | processador=" + processador;
    }
}
