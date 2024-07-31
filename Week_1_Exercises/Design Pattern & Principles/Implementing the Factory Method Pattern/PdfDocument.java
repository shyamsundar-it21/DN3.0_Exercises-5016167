package factory;

public class PdfDocument implements Document {
    @Override
    public void read() {
        System.out.println("Reading Pdf document");
    }

    @Override
    public void write() {
        System.out.println("Writing Pdf document");
    }
}
