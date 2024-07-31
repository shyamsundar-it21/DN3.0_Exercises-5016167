package proxy;

public class RealImage implements Image {

    private final String url;

    public RealImage(String url) {
        this.url = url;
        loadFormServer();
    }

    @Override
    public void display() {
        System.out.println("Display loaded image, url: " + url);
    }

    private void loadFormServer() {
        System.out.println("Load image from server, url: " + url);
    }

}
