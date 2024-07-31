package builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("Samsung DRAM")
                .setStorage("Samsung SSD")
                .build();

    }
}
