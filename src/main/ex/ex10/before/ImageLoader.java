package main.ex.ex10.before;

public class ImageLoader {
    private String imagePath;

    public ImageLoader(String imagePath) {
        this.imagePath = imagePath;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading image from " + imagePath);
        // 실제 이미지 로드 로직 (파일에서 이미지를 읽어오는 작업 등)
    }

    public void displayImage() {
        System.out.println("Displaying image from " + imagePath);
        // 이미지 표시 로직
    }
}