package main.ex.ex1.before;

public class NotificationService {

    public void sendNotification(String type, String message) {
        if (type.equals("EMAIL")) {
            sendEmail(message);
        } else if (type.equals("SMS")) {
            sendSMS(message);
        } else if (type.equals("PUSH")) {
            sendPushNotification(message);
        }
    }

    private void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }

    private void sendPushNotification(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
