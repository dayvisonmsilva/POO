package classes;

public class EntradaEmAgenda {
    private int hora, dia, mes, ano;
    private String assunto;

    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }

    @Override
    public String toString() {
        return "Hora: " + hora + ", Dia: " + dia + ", Mês: " + mes + ", Ano: " + ano + ", Assunto: " + assunto;
    }
}