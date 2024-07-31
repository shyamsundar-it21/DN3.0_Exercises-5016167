package factory;

public class WordDocument implements Document {
    @Override
    public void read() {
        System.out.println("Reading Word document");
    }

    @Override
    public void write() {
        System.out.println("Writing Word document");
    }
}
