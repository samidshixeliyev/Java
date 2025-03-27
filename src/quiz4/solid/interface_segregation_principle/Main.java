package quiz4.solid.interface_segregation_principle;
// Ayrı interfeyslər yaradılır
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Printer sinfi yalnız çap funksiyasını icra edir
class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document");
    }
}

// Scanner sinfi yalnız skan funksiyasını icra edir
class Scanner implements Scannable {
    @Override
    public void scan() {
        System.out.println("Scanning document");
    }
}

// Multifunksional cihaz həm çap, həm skan edə bilər
class MultiFunctionMachine implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }
}

// Test
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();

        Scanner scanner = new Scanner();
        scanner.scan();

        MultiFunctionMachine multiMachine = new MultiFunctionMachine();
        multiMachine.print();
        multiMachine.scan();
    }
}
