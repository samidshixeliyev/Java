package quiz4;

public class Computer {
    private final String RAM;
    private final String Storage;
    private final String CPU;
    private final String GraphicsCard;
    private Computer(ComputerBuilder builder) {
        this.RAM=builder.Ram;
        this.CPU=builder.CPU;
        this.Storage=builder.Storage;
        this.GraphicsCard= builder.GraphicsCard;
    }
    public String getRam() {
        return RAM;
    }
    public String getStorage() {
        return Storage;
    }
    public String getCPU() {
        return CPU;
    }
    public String getGraphicsCard() {
        return GraphicsCard;
    }
    @Override
    public String toString() {
        return "Computer { RAM=" + RAM + ", Storage=" + Storage + ", CPU=" + CPU + ", GraphicsCard=" + GraphicsCard + " }";
    }
    public static class ComputerBuilder {
        private String Ram;
        private String Storage;
        private String CPU;
        private String GraphicsCard;
        public ComputerBuilder setRAM(String RAM) {
            this.Ram = RAM;
            return this;
        }

        public ComputerBuilder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String GraphicsCard) {
            this.GraphicsCard = GraphicsCard;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
