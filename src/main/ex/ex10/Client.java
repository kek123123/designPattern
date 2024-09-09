package main.ex.ex10;

import main.ex.ex10.after.Image;
import main.ex.ex10.after.ProxyImage;
import main.ex.ex10.before.ImageLoader;

public class Client {

    public static void main(String[] args) {
        ImageLoader imageLoader = new ImageLoader("/test");
        //Image로더를 생성하면 바로 load
        imageLoader.displayImage();

        Image proxy = new ProxyImage("/test");
        //생성할때 load되지않고 display를 호출하면 load
        //proxy.displayImage();
    }
}
