class CPU {
    double price;

    // nested class
    class Processor {
        // members of nested class
        double cores;
        String manufacturer;

        double getCache() {
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM {
        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}

class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor proc = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache\t= " + proc.getCache());
        System.out.println("RAM Clock Speed\t= " + ram.getClockSpeed());
    }
}
