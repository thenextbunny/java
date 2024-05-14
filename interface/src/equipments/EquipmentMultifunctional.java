package equipments;

import equipments.copyMachine.CopyMachine;
import equipments.printer.Printer;
import equipments.scanner.Scanner;

public class EquipmentMultifunctional implements Printer, Scanner, CopyMachine {

    @Override
    public void copy() {
        System.out.println("Copying...");
    }

    @Override
    public void scan() {
       System.out.println("Scanning...");
    }

    @Override
    public void print() {
        System.out.println("Printing...");
    }
   
}
