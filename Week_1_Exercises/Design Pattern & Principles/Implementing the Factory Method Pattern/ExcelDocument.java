package factory;

public class ExcelDocument implements Document {
    @Override
    public void read() {
        System.out.println("Reading Excel document");
    }

    @Override
    public void write() {
        System.out.println("Writing Excel document");
    }
}
