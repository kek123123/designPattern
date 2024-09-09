package main.ex.ex1.after;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void send() {
        System.out.println("SMS 발송");
    }
}
