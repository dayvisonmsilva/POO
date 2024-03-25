package Reuso_de_Classes.Q38;

public class TestaEquipamento {
    public static void main(String[] args) {
        Computador pc1 = new Computador("12-232313", "HP", "Windows", "Intel");
        Computador pc2 = new Computador("12-132123", "Positivo", "Linux", "AMD");
        Computador pc3 = new Computador("12-565567", "Apple", "MacOS", "Intel");
        
        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
    }
}
