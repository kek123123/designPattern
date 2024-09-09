package main.ex.ex10.after;

public class ProxyImage implements Image {

    AfterImageLoader afterImageLoader;
    String imagePath;

    public ProxyImage(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void displayImage() {
        afterImageLoader = new AfterImageLoader(imagePath);
        afterImageLoader.displayImage();
    }
}
