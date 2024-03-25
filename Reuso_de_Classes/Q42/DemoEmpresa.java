package Reuso_de_Classes.Q42;

public class DemoEmpresa {
    public static void main(String[] args) {
        Administrativo adm = new Administrativo("João", 1000.0, "12-2323", "Vendas");
        Tecnico tec = new Tecnico("Mariana", 1000.0, "11-2313", "TI");
        adm.setTurnoNoturno(true);
        
        double ganhoAdm = adm.ganhoAnual(10, 10.0);
        double ganhoTec = tec.ganhoAnual(10, 10.0);

        System.out.println(adm + " | Ganho Adm: " + String.format("%.2f", ganhoAdm));
        System.out.println(tec + " | Ganho Tec: " + String.format("%.2f", ganhoTec));
    }
}
