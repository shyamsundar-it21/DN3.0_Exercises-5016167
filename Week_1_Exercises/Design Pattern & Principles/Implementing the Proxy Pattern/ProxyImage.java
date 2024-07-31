package proxy;

public class ProxyImage implements Image {

    private final String url;
    private Image realImage;

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if (realImage == null)
            realImage = new RealImage(url);

        realImage.display();
    }

}
