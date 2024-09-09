package main.ex.ex1;

import main.ex.ex1.after.*;
import main.ex.ex1.before.NotificationService;

public class Client {

    public static void main(String[] args) {
        //before
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("EMAIL", "이메일 발송");
        notificationService.sendNotification("SMS", "SMS 발송");
        notificationService.sendNotification("PUSH", "PSUH 발송");
        //알림톡이 추가될 경우 NotificationService의 로직을 수정해야한다.

        //after
        NotificationStrategy emailNotification = new EmailNotification();
        AfterNotificationService afterNotificationService = new AfterNotificationService(emailNotification);
        afterNotificationService.send();

        NotificationStrategy smsNotification = new SMSNotification();
        AfterNotificationService afterNotificationService2 = new AfterNotificationService(smsNotification);
        afterNotificationService2.send();

        NotificationStrategy kakaoNotification = new KakaoNotification();
        AfterNotificationService afterNotificationService3 = new AfterNotificationService(kakaoNotification);
        afterNotificationService3.send();

    }
}
