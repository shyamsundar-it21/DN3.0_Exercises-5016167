package factory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new PdfDocumentFactory();
        Document pdf = factory.createDocument();
        pdf.read();
        pdf.write();

        factory = new WordDocumentFactory();
        Document word = factory.createDocument();
        word.read();
        word.write();

        factory = new ExcelDocumentFactory();
        Document excel = factory.createDocument();
        excel.read();
        excel.write();
    }
}
