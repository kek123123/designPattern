package main.ex.ex1.after;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send() {
        System.out.println("이메일 발송");
    }
}
