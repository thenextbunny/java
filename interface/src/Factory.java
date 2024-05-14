import equipments.EquipmentMultifunctional;
import equipments.printer.DeskJet;
import equipments.printer.Printer;

public class Factory {
    public static void main(String[] args) {
        System.out.println("Normal printer :D");
        Printer printer = new DeskJet();

        printer.print();

        System.out.println("Multifunctional printer :P");
        EquipmentMultifunctional multifunctional = new EquipmentMultifunctional();

        multifunctional.scan();
        multifunctional.copy();
        multifunctional.print(); 
    }
}
