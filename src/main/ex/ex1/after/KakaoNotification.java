package main.ex.ex1.after;

public class KakaoNotification implements NotificationStrategy {
    @Override
    public void send() {
        System.out.println("kakao 발송");
    }
}
