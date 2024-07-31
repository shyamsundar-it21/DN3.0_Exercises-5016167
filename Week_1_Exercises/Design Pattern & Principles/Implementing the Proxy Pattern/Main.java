package proxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("https://acutecoder.com/img11.png");
        Image image2 = new ProxyImage("https://google.com/img1.png");

        image1.display();
        image1.display();
        image2.display();
        image2.display();
    }
}
