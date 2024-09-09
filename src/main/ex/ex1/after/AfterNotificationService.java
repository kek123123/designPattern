package main.ex.ex1.after;

public class AfterNotificationService {

    private NotificationStrategy notificationStrategy;

    public AfterNotificationService(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void send() {
        notificationStrategy.send();
    }
}
